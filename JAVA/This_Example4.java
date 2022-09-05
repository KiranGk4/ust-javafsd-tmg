package com.ust;

public class This_Example4 {

	int val_a, val_b;
	
	This_Example4()		// default constructors
	{
		val_a = 10;
		val_b = 20;
	}
	
	This_Example4 get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("val_a = "+val_a+" val_b = "+val_b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Example4 object = new This_Example4();
		object.get().display();
	}

}
