package com.ust;

public class This_Example2 {
	
	int val1, val2;
	This_Example2()
	{
		val1 = 10;
		val2 = 20;
	}
	
	void printVal(This_Example2 obj)
	{
		System.out.println("val1 = "+ obj.val1 +" val2 = "+obj.val2);
	}
	
	void get()
	{
		printVal(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Example2 object = new This_Example2();
		object.get();
	}

}
