package java8.method_reference;

public class InstanceMethodReference_Example {
	
	public void printnMsg()
	{
		System.out.println("Hello, this is instance method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2 = new Thread(new InstanceMethodReference_Example()::printnMsg);
		t2.start();
	}

}
