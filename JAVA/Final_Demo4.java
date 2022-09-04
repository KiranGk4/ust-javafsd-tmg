package com.ust;

final class FinalClass
{
	public void display()
	{
		System.out.println("This is final method.");
	}
}
public class Final_Demo4{
	public void display()
	{
		System.out.println("The final method is not overridden.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Demo4 obj = new Final_Demo4();
		obj.display();
	}

}
