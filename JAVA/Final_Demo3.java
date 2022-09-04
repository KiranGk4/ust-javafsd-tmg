package com.ust;
class FinalDemo1
{
	public final void display()
	{
		System.out.println("This is a final method.");
	}
}
public class Final_Demo3 extends FinalDemo1
{
	public final void display1()
	{
		System.out.println("The final method is overridden.");
	}

	public static void main(String[] args)
	{
		Final_Demo3 obj = new Final_Demo3();
		obj.display();
	}
}
