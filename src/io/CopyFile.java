package io;

public class CopyFile {
	public static void main(String[] args) {
		MyBufferedReaderWriter rw = new MyBufferedReaderWriter();
		
		rw.openRFile("README.md");
		rw.openWFile("README.copy.md");
		String line;
		while ((line = rw.readLine()) != null) {
			System.out.println("Copying line: " + line);
			rw.writeLine(line);
		}
		
		rw.closeRFile();
		rw.closeWFile();
	}
}
