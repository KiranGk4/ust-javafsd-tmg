package com.ust.day3;

public class Finally_Exception_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int divideByZero = 5/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic Exception = "+e.getMessage());
		}
		finally
		{
			System.out.println("This is finally block");
		}
	}

}
