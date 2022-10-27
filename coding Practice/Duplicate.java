import java.lang.*;
import java.io.*;
import java.util.*;

public class Duplicate
{
	public static void main(String args[])
	{
		int count=0;
   		Scanner sc=new Scanner(System.in);
   		List<Integer> lst= new ArrayList<Integer>();
   
   		lst.add(10);
   		lst.add(20);
   		lst.add(30);
   		lst.add(10);
		System.out.print("Array elements: ");
		for(Integer i:lst)
			System.out.print(i+" ");
		System.out.print("\nUnique elements: ");
   		for(int i=0;i<4;i++)
   		{
     
     			for(int j=0;j<4;j++)
      			{
      				if(i==j)
     				{
      					count++;

				}
      			}
   
    			if(count!=1)
   			{
				System.out.print(lst.get(i) +" ");
   			}

  		}
	}
}