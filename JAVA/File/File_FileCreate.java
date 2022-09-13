package exceptions;

import java.io.File;

public class File_FileCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("newFile.txt");
		
		try
		{
			boolean value = f.createNewFile();
			if(value)
			{
				System.out.println("New file is created.");
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	}

}
