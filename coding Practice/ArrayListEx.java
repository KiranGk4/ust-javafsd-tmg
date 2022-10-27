import java.lang.*;
import java.io.*;
import java.util.*;

public class ArrayListEx
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
   		System.out.print("Enter the number:");
   		int n=sc.nextInt();
   
   		List<Integer> lst=new ArrayList<Integer>();
   		lst.add(n);
   		System.out.println(lst);
   		System.out.println("After Removing Leading Zero:"+n);
	}
}