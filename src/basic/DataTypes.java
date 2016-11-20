package basic;

public class DataTypes {
	public static void main(String[] args) {
		//The size of each variable depends to the VM
		//The sizes shown here are indicative
		int x = 15;						//32 bits
		double y = 2.9;					//64 bits
		String s = "This is a string";	//16 bits for each letter (UTF encode)
		boolean f = false;				//8 bits
		
		byte b = -51;					//8 bits
		short h = 256;					//16 bits
		long l = 1024;					//64 bits
		float t = 6.9f;					//32 bits
		char c = 'p';					//16 bits (UTF encode)
	}
}
