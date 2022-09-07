package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee2
{
	String name;
	int eID;
	static Scanner sc = new Scanner(System.in);
	void addDetails(int i)
	{
		System.out.print(i+"."+"\tEnter name: ");
		this.name = sc.next();
		System.out.print("\tEnter Employee ID: ");
		this.eID = sc.nextInt();
	}
	
	void display(int count)
	{
		System.out.println(count+"."+"\tName: "+this.name);
		System.out.println("\tEmployee ID: "+this.eID);
	}
}
public class SBA2_Q3 extends Employee2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		List<Employee2> lst = new ArrayList<>();
		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		System.out.println("------------------------------");
		
		Employee2 e[] = new Employee2[n+1];
		for(int i = 1; i<=n; i++)
		{
			e[i] = new Employee2();
			e[i].addDetails(i);
			lst.add(e[i]);
		}
		
		System.out.println("------------------------------");
		
		Iterator<Employee2> itr = lst.iterator();
		while(itr.hasNext())
		{
			count++;
			itr.next().display(count);
		}
		//lst.add(1);
	}

}
