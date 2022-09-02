package com.ust;
import com.ust.InstanceOf_Example;
//class Fruit1{}
//class Vehicle1{}

public class InstanceOf_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit();
		Vehicle car = new Vehicle();
		
		//System.out.println("car is a fruit "+(car instanceof Fruit)); //shows error because car is not instance of Fruit
		System.out.println("car is a fruit "+(apple instanceof Fruit));
		
	}

}
