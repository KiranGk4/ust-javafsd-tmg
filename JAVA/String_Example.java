package com.ust;

public class String_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "	Kiran	";
		String str1 = new String("Manju");
		//str = str + str1;
		System.out.println(str+str1);
		
		System.out.println(str.toUpperCase());
		
		if(str.trim().equals("Kiran"))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not equals");
		}
		
		System.out.println(str1.startsWith("M"));
		System.out.println(str1.substring(3));
	}

}
