package com.ust.day3;
import java.io.*;
public class IO_Exception_Example {
	public static void findFile()throws IOException
	{
		File newFile = new File("test.txt");
		FileInputStream fis = new FileInputStream(newFile);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			findFile();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	

}
