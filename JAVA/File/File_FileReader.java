package exceptions;


import java.io.FileReader;

public class File_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = new char[100];
		
		try
		{
			FileReader fr = new FileReader("input.txt");
			
			fr.read(arr);
			System.out.println("Data in the file");
			System.out.println(arr);
			
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

