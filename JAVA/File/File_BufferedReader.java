package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class File_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[] = new char[100];
		
		try
		{
			FileReader f = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(f);
			
			br.read(arr);
			System.out.println("Data in the file: ");
			System.out.println(arr);
			
			br.close();
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
