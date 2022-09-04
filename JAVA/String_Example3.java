package com.ust.day3;

public class String_Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Learn Java";
		int result;
		
		result = str1.indexOf('J');		// index of char j
		System.out.println(result);
		
		result = str1.indexOf('a');		// first occurence of a
		System.out.println(result);
		
		result = str1.indexOf('j');		// char not in string
		System.out.println(result);
		
		result = str1.indexOf("ava");	// index of ava
		System.out.println(result);
		
		result = str1.indexOf("java");	// substring not in string
		System.out.println(result);
		
		result = str1.indexOf("");		// index of empty string
		System.out.println(result);
	}

}
