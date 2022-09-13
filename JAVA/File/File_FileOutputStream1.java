package exceptions;

import java.io.FileOutputStream;

public class File_FileOutputStream1 {
	public static void main(String args[])
	{
		String data = "This is a line of text inside th file.";
		
		try
		{
			FileOutputStream fos = new FileOutputStream("input.txt");
			byte arr[] = data.getBytes();
			
			fos.write(arr);
			fos.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
