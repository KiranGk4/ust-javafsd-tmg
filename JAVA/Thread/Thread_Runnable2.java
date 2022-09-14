package threads;

public class Thread_Runnable2 implements Runnable {
	
	@Override
	public void run()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread("Guru1");
		Thread t2 = new Thread("Guru2");
		t1.start();
		t2.start();
		System.out.println("Thread names are following.");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}

}
