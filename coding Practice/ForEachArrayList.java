import java.lang.*;
import java.io.*;
import java.util.*;

public class ForEachArrayList
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List arrayList = new ArrayList();
		System.out.println("Enter total number of elements: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			arrayList.add(sc.nextInt());
		arrayList.forEach(val->System.out.print(val+","));
	}
}