package com.ust;

public class This_Constructor_Example {
	
	int val1, val2;
	
	This_Constructor_Example()
	{
		this(10,20);
		System.out.println("Default Constructor");
	}
	
	This_Constructor_Example(int val1, int val2)
	{
		this.val1 = val1;
		this.val2 = val2;
		System.out.println("Parameterised Constructor");
	}
	public static void main(String args[])
	{
		This_Constructor_Example object = new This_Constructor_Example();
	}

}
