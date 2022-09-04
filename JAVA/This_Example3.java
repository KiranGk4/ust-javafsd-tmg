package com.ust;

public class This_Example3 {
	
	void print()
	{
		this.show();
		System.out.println("This_Example3: print()");
	}
	
	void show()
	{
		System.out.println("This_Example4: show");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Example3 t1 = new This_Example3();
		t1.print();
	}

}
