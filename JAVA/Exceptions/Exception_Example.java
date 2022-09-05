package com.ust.day3;

public class Exception_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int divideByZero = 5/0;
			System.out.println("Rest of code in try block");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic Exception = "+e.getMessage());
		}
	}

}
