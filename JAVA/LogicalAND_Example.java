package com.ust;

public class LogicalAND_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=10; ++i)
		{
			if(i>4 && i<9)
				continue;
			System.out.println(i);
		}
	}

}
