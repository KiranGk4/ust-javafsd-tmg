package threads;

public class Thread_Runnable implements Runnable {
	@Override
	public void run()
	{
		System.out.println("Doing heavy processing - START"+Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(1000);
			doDBProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing - END"+Thread.currentThread().getName());
	}
	
	private void doDBProcessing() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Thread_Runnable();
		r.run();
	}

}
