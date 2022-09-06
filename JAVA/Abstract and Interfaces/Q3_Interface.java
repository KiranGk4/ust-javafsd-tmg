package abstractAndInterfaces;

abstract class Abstract_Example1
{
	Abstract_Example1()
	{
		System.out.println("Construct of Abstract class");
	}
	
	abstract void showAbstract();
	
}
public class Q3_Interface extends Abstract_Example{
	
	Q3_Interface()
	{
		super();
		System.out.println("Hi");
	}
	
	public void showAbstract()
	{
		System.out.println("Abstract Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3_Interface q3 = new Q3_Interface();
		q3.showAbstract();
		
	}

}
