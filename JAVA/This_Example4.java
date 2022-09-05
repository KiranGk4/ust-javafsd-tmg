package com.ust;

class This_Example41 {

	int val_a, val_b;
	
	This_Example41()		// default constructors
	{
		val_a = 10;
		val_b = 20;
	}
	
	This_Example41 get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("val_a = "+val_a+" val_b = "+val_b);
	}
}
	
public class This_Example4
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Example41 object = new This_Example41();
		object.get().display();
	}

}
