package abstractAndInterfaces;

public class Method_Overloading {

	private static void display(int a)
	{
		System.out.println("Got Integer data.");
	}
	
	private static void display(String a)
	{
		System.out.println("Got string object");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1);
		display("Hello");
	}

}
