package com.ust;

public class SwitchExample {
	public static void main(String args[])
	{
		String str = "green";
		switch(str)
		{
			case "red": System.out.println("I am in red");
						System.out.println("*");
						break;
			
			case "green": System.out.println("Green");
						  System.out.println("*");
						  break;
						  
			default: System.out.println("Invalid input");
					 break;
		}
	}
}
