package collection;

class DemoClass
{
	public <T> void genericMethod(T data)
	{
		System.out.println("Generics Method: ");
		System.out.println("Data Passed: "+data);
	}
}
public class Generic_Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass demo = new DemoClass();
		
		demo.<String>genericMethod("Java Programming");
		demo.<Integer>genericMethod(25);
	}

}
