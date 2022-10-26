import java.lang.*;
import java.io.*;
import java.util.*;

public class Ci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the p amount: ");
		int p = sc.nextInt();
		System.out.println("Enter the r of interest: ");
		int r = sc.nextInt();
		System.out.println("Enter the t period: ");
		int t = sc.nextInt();
		System.out.println("Enter the n of years: ");
		int n = sc.nextInt();
		double a = Math.pow((1+(r/n)),n*t);
		double ci = p*a;
		System.out.println("CI = "+ci);
	}
}