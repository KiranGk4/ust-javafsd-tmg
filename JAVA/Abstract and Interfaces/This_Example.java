package abstractAndInterfaces;

public class This_Example {
	
	int a,b;
	
	This_Example()
	{
		a = 10;
		b = 20;
	}
	
	This_Example get()
	{
		return this;
	}
	
	void display()
	{
		System.out.println("a = "+ a +"b = "+b);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		This_Example obj = new This_Example();
		obj.get().display();
	}

}
