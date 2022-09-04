package com.ust.day3;

class Animal4
{
	Animal4()
	{
		System.out.println("I am an animal");
	}
	
	Animal4(String type)
	{
		System.out.println("Type: "+type);
	}
}

class Dog4 extends Animal4
{
	Dog4()
	{
		super("Animal");
		System.out.println("I am a dog");
	}
}
public class Super_Constructor_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog4 dog4 = new Dog4();
	}

}
