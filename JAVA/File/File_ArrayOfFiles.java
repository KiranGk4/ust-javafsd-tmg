package exceptions;

import java.io.File;

public class File_ArrayOfFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\ustjavafsdb208\\eclipse-workspace\\JAVA Example\\src");
		
		String fileList[] = f.list();
		
		for(String str:fileList)
			System.out.println(str);
	}

}
