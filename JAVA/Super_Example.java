package com.ust;

public class Super_Example extends Super_Most{
	String color = "white";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
		super.display();
	}
	
	Super_Example()
	{
		super();
		System.out.println("in sub constructor");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Super_Example s = new Super_Example();
		//Super_Most m = new Super_Most();
		//System.out.println(s.color);
		
		s.display();
		
		
	}

}

class Super_Most
{
	String color = "black";
	void display()
	{
		System.out.println("in super");
	}
	
	Super_Most()
	{
		System.out.println("in super constructor");
	}
}