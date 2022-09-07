package collection;

import java.util.Scanner;

abstract class Employee
{
	int bonus = 1000;
	abstract int calculateSalary(int basicPay);
	abstract void fetchDepartment();
}

class Engineer extends Employee
{
	public int calculateSalary(int basicPay)
	{
		return basicPay + bonus;
	}
	public void fetchDepartment()
	{
		System.out.println("Department: Civil");
	}
}

class Doctor extends Employee
{
	public int calculateSalary(int basicPay)
	{
		return basicPay + bonus;
	}
	public void fetchDepartment()
	{
		System.out.println("Department: Ortho");
	}
}
public class SBA2_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basicPay, eID;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name of Engineer: ");
		name = sc.next();
		System.out.print("Employee ID: ");
		eID = sc.nextInt();
		System.out.print("Basic Pay of Engineer: ");
		basicPay = sc.nextInt();
		
		Engineer e = new Engineer();
		System.out.println("--------------------------------------------");
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+eID);
		System.out.println("Salary: "+ e.calculateSalary(basicPay));
		e.fetchDepartment();
		
		System.out.println("--------------------------------------------");
		System.out.print("Name of Doctor: ");
		name = sc.next();
		System.out.print("Employee ID: ");
		eID = sc.nextInt();
		System.out.print("Basic Pay of Doctor: ");
		eID = sc.nextInt();
		
		Doctor d = new Doctor();
		System.out.println("--------------------------------------------");
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+eID);
		System.out.println("Salary: "+ d.calculateSalary(basicPay));
		d.fetchDepartment();
		
	}

}
