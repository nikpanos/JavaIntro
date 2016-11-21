package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDBConnector {

	public static void main(String[] args) {
		MyDBConnector a = new MyDBConnector();
		Connection con = a.open("jdbc:mysql://localhost:3306/mytestdb", "root", "");
		try {
			a.update("INSERT INTO IMPFACTORS(id, name, factor) VALUES (0, 'test', 5.5)", con);
			
			ResultSet rs = a.fetch("SELECT * FROM IMPFACTORS", con);
			a.printResultSet(rs);
		}
		finally {
			a.close(con);
		}
			
		System.out.println("Bye bye...");
	}

	private final String DRIVER = "com.mysql.jdbc.Driver";

	public Connection open(String sUrl, String sUser, String sPwd) {
		Connection con=null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection (sUrl, sUser, sPwd);		
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		/*finally {
			if (con != null) 
				try { con.close(); System.out.println("open() Connection closed"); } 
			catch (SQLException ignore) {}
		}*/
		return con;
	}

	public Connection open(String sHost, String sPort, String sDatabase, String sUser, String sPwd) {
		String sUrl = "jdbc:mysql://" + sHost +":"+ sPort+ "/" + sDatabase;
		Connection con=null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection (sUrl, sUser, sPwd);		
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		/*finally {
			if (con != null) 
				try { con.close(); System.out.println("open() Connection closed"); } 
			catch (SQLException ignore) {}
		}*/
		return con;
	}

	public void close(Connection con) {
		try {
			con.close();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (con != null) 
				try { con.close(); System.out.println("close() Connection closed"); } 
			catch (SQLException ignore) {}
		}
	}

	public void update(String sQuerySQL, Connection con) {
		try {
			PreparedStatement pst = con.prepareStatement(sQuerySQL);
			pst.executeUpdate();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		/*finally {
			if (con != null) 
				try { con.close(); System.out.println("update() Connection closed"); } 
			catch (SQLException ignore) {}
		}*/
	}

	public ResultSet fetch(String sQuerySQL, Connection con) {
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sQuerySQL);
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		/*finally {
			try {
				if (stmt != null) {
					stmt.close(); 
					System.out.println("fetch() Statement closed");
				}
				if (con != null) { 
					con.close(); 
					System.out.println("fetch() Connection closed");
				}
			}
			catch (SQLException ignore) {}
		}*/
		return rs;
	}

	public void printResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				ResultSetMetaData rsmd = rs.getMetaData();
				int nCols = rsmd.getColumnCount();
				while (rs.next()) {
					for (int i=1 ; i <= nCols ; i++) {
						Object o = rs.getObject(i);
						System.out.print(o.toString()+" ");
					}
				}
				System.out.println();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
