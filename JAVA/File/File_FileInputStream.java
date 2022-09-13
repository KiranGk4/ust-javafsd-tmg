package exceptions;

import java.io.FileInputStream;

public class File_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream input = new FileInputStream("input.txt");
			System.out.println("Data in the file.");
			
			int i = input.read();
			
			while(i != -1)
			{
				System.out.print((char)i);
				i = input.read();
			}
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
