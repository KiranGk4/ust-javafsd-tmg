package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_Buffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try
		{
			System.out.println("Enter the age: ");
			String age = br.readLine();
			System.out.println(age);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
