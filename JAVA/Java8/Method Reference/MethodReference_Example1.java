package java8.method_reference;

public class MethodReference_Example1 {
	public static void ThreadStatus()
	{
		System.out.println("This thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2 = new Thread(MethodReference_Example1::ThreadStatus);
		t2.start();
	}

}
