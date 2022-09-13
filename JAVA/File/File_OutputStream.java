package exceptions;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class File_OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "This is a line of text inside the file.";
		
		try
		{
			OutputStream out = new FileOutputStream("input.txt");
			
			byte[] dataBytes = data.getBytes();
			
			out.write(dataBytes);
			
			out.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
