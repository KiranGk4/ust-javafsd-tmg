package exceptions;

import java.io.FileInputStream;
import java.io.InputStream;

public class File_InputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte arr[] = new byte[100];
		
		try
		{
			InputStream input = new FileInputStream("C:\\Users\\ustjavafsdb208\\AB.txt");
			
			System.out.println("Available bytes in file: "+input.available());
			
			input.read(arr);
			System.out.println("Data read from the file: ");
			
			String data = new String(arr);
			System.out.println(data);
			
			input.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
