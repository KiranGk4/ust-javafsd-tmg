package com.ust.day3;

class Animal1
{
	public void display()		// overriden method
	{
		System.out.println("I am an animal");
		
	}
}

class Dog1 extends Animal1
{
	@Override
	public void display()		// overriding method
	{
		System.out.println("I am a dog");
		
	}
	
	public void printMessage()
	{
		display();	// calls overriding method
		
		super.display();   //calls overridden method
	}
}


public class Super_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 dog1 = new Dog1();
		dog1.printMessage();
	}

}

