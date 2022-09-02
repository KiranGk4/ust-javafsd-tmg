package com.ust;

public class LabelledBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first:
		for (int i = 1;i<5;i++)
		{
			second:
			for(int j=1;j<3;j++)
				System.out.println("i = "+i+";j = "+j);
			if(i==2)
				break first;
		}
	}

}
