package com.ust;
import java.lang.System;
/**
 * The type Final demo 1.
 */
class FinalDemo1
{
	/**
	 * Display.
	 */
	public final void display()
	{
		System.out.println("This is a final method.");
	}
}

/**
 * The type Final demo 3.
 */
public class Final_Demo3 extends FinalDemo1
{
	/**
	 * Display 1.
	 */
	public final int display1()
	{

		System.out.println("The final method is overridden.");
		return 0;
	}

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args)
	{
		Final_Demo3 obj = new Final_Demo3();
		obj.display();
	}
}
