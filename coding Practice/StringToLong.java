import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class StringToLong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		System.out.println("String: "+s+" Type: "+s.getClass().getSimpleName());
		long l = Long.parseLong(s);
		System.out.println("Long: "+l+" Type: "+((Object)l).getClass().getSimpleName());
	}
}