package java8.defaultandstatic;

interface TestInterface
{
	public void square(int a);
	
	default void show()
	{
		System.out.println("Default Method Executed");
	}
}
public class InterfaceDefault_Example implements TestInterface{
	
	public void square(int a)
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDefault_Example t = new InterfaceDefault_Example();
		t.square(4);
		t.show();
	}

}
