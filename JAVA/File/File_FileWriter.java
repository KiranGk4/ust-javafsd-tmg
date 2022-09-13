package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File_FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "This is the data in the output file.";
		
		try
		{
			FileWriter file = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(file);
			
			bw.write(data);
			bw.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
