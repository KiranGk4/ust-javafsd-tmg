import java.lang.*;
import java.io.*;
import java.util.*;

public class AsciiSample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		//int i = (int)ch;
		//System.out.println(i);
		int ascii;
		String res = " ";
		String password = "Kiran@123";
		for(int i=0;i<password.length();i++)
		{
			ch = password.charAt(i);
			ascii = (int)ch;
			ascii++;
			ch = (char)ascii;
			res = res + ch;
		}
		res = res.trim();
		System.out.println(res);
	}
}