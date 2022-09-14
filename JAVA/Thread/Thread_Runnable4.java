package threads;

public class Thread_Runnable4 implements Runnable{
	
	Thread t;
	Thread_Runnable4(String str)
	{
		t = new Thread(this, str);
		t.start();
	}
	
	public void run()
	{
		for(int i = 0; i<=5; i++)
		{
			if((i%5 == 0))
			{
				System.out.println(Thread.currentThread().getName() + " yielding control...");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished executing.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread_Runnable4("Thread 1");
		new Thread_Runnable4("Thread 2");
		new Thread_Runnable4("Thread 3");
	}

}
