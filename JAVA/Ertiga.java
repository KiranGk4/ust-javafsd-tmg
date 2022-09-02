package com.ust;

class Car{
	String model;
	String color;
	int wheels;
	int seats;
	String gearType;
	
	void display()
	{
		System.out.println("class Car");
	}
}

class Ciaz extends Car{
	void display()
	{
		System.out.println("class Ciaz");
	}
	
	void show()
	{
		System.out.println("in show of Ciaz");
	}
	
}
public class Ertiga extends Car {
	
	void display()
	{
		System.out.println("class Ertiga");
		super.display();
	}
	
	public static void main(String args[])
	{
		Ciaz c = new Ciaz();
		c.display();
		c.show();
		
		Ertiga e = new Ertiga();
		e.display();
		System.out.println(e.color);
		
	}

}
