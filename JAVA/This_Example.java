package com.ust;

public class This_Example {
	
	int val1, val2;
	
	This_Example(int val1, int val2)	// parameterised constructor
	{
		this.val1 = val1 + val1;
		this.val2 = val2 + val2;
	}
	
	void display()
	{
		System.out.println("Value val1 = "+ val1 + "\nValue val2 ="+val2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Example object = new This_Example(5,10);
		object.display();
	}

}
