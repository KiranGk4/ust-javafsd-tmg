package com.ust;

class Fruit{}
class Vehicle{}

public class InstanceOf_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit pineapple = new Fruit();
		Vehicle truck = new Vehicle();
		
		System.out.println("Pineapple is a fruit "+(pineapple instanceof Fruit));
		System.out.println("Truck is a vehicle "+(truck instanceof Vehicle));
		
	}

}
