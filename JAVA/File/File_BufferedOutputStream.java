package exceptions;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class File_BufferedOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "This is a line of text inside the file.";
		
		try
		{
			FileOutputStream file = new FileOutputStream("output.txt");
			BufferedOutputStream output = new BufferedOutputStream(file);
			
			byte[] arr = data.getBytes();
			output.write(arr);
			output.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
