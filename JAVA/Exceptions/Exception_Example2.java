package com.ust.day3;

public class Exception_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int array[] = new int[10];
			array[10] = 30/0;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
