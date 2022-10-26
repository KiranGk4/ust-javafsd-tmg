import java.lang.*;
import java.io.*;
import java.util.*;

public class Largest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = 0;
		for(int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(max<arr[i])
				max = arr[i];
		}
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println("Max = "+max);
	}
}