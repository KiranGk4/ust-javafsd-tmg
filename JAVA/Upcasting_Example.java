package com.ust;

public class Upcasting_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum = 0;
		double average;
		for(int number:numbers)
		{
			sum+=number;
		}
		
		int arrayLength = numbers.length;
		average = ((double)sum / (double)arrayLength);
		
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
	}

}
