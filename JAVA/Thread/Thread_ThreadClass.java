package threads;

public class Thread_ThreadClass extends Thread {
	
	public Thread_ThreadClass(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
		System.out.println("My Thread - START"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
			doDBProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("My Thread - END "+Thread.currentThread().getName());
		
	}
	
	public void doDBProcessing() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_ThreadClass t1 = new Thread_ThreadClass("Test");
		t1.start();
	}

}
