package com.ust;

public class Final1 extends Super1{
	final int x=5;
	int y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final1 f = new Final1();
		//f.x=7;
		f.y = 10;
		System.out.println(f.z);
		f.display();
		
	}

}

class Super1
{
	final int z=10;
	final void display()
	{
		System.out.println("in display");
	}
	
	void display(int x)
	{
		System.out.println("*");
	}
}
