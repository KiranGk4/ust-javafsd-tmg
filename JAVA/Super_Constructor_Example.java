package com.ust.day3;

class Animal3
{
	Animal3()
	{
		System.out.println("I am animal");
	}
}

class Dog3 extends Animal3
{
	Dog3()
	{
		super();
		System.out.println("I am a dog");
	}
}
public class Super_Constructor_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 dog3 = new Dog3();
	}

}
