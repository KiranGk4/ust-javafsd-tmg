package collection;

import java.util.Scanner;

interface Employee1
{
	public int bonus = 1000;
	public int calculateSalary(int basicPay);
	public void fetchDepartment();
}

class Engineer1 implements Employee1
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

class Doctor1 implements Employee1
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
public class SBA2_Q2 {

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
		
		Engineer1 e = new Engineer1();
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
		
		Doctor1 d = new Doctor1();
		System.out.println("--------------------------------------------");
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+eID);
		System.out.println("Salary: "+ d.calculateSalary(basicPay));
		d.fetchDepartment();
		
	}

}
