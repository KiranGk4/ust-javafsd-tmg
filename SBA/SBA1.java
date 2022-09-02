package com.ust;

import java.util.Scanner;

class Employee
{
	int eID;
	String name;
	String workLocation;
	String designation;
	long mobileNumber;
	float salary;
	static Scanner s = new Scanner(System.in);
	
	void salary(int a)
	{
		this.salary = a;
		System.out.println("Salary method with parameter type int");
	}
	void salary(float b)
	{
		this.salary = b;
		System.out.println("Salary method with parameter type float");
	}
	
	void add(int a)		//overriding
	{
		this.eID = a;
		System.out.println("in class employee(parent)");
	}
	
	void addDetails()
	{
		System.out.println("Enter name: ");
		this.name = s.next();
		System.out.println("Enter work location: ");
		this.workLocation = s.next();
		System.out.println("Enter designation: ");
		this.designation = s.next();
		System.out.println("Enter mobile number: ");
		this.mobileNumber = s.nextLong();
	}
	
	void display()
	{
		System.out.println("EID = "+this.eID);
		System.out.println("Name = "+this.name);
		System.out.println("Work Location = "+this.workLocation);
		System.out.println("Designation = "+this.designation);
		System.out.println("Salary = "+this.salary);
		System.out.println("Mobile = "+this.mobileNumber);
	}
}

class Engineer extends Employee
{
	void salary(float b)
	{
		this.salary = b;
		System.out.println("Salary method with parameter type float");
	}
	
	void add(int a)
	{
		super.add(a);
	}
}

public class SBA1 extends Engineer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engineer e = new Engineer();
		
		System.out.println("Enter Employee ID: ");
		int x = s.nextInt();
		
		System.out.println("Enter salary: ");
		float y = s.nextFloat();
		
		e.addDetails();
		e.add(x);
		e.salary(y);
		e.display();
		
	}

}
