package exceptions;

import java.io.File;

public class File_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("newFile.txt");
		
		boolean value = f.delete();
		if(value)
			System.out.println("File deleted");
		else
			System.out.println("File is not deleted");
	}

}
