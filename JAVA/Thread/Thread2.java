package threads;

public class Thread2 implements Runnable{
	
	public void run()
	{
		System.out.println("Thread run using runnable");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Thread2();
		r.run();
	}

}
