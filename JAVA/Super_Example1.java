package com.ust.day3;

class Animal
{
	public void display()		// overridden method
	{
		System.out.println("I am an animal");
		
	}
}

class Dog extends Animal
{
	@Override
	public void display()		// overriding method
	{
		System.out.println("I am a dog");
		
	}
	
	public void printMessage()
	{
		display();
	}
}


public class Super_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.printMessage();
	}

}
