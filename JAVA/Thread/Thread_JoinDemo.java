package threads;

import java.lang.*;
public class Thread_JoinDemo implements Runnable{
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: "+t.getName());
		
		System.out.println("Is Alive? "+t.isAlive());
	}

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Thread_JoinDemo());
		t.start();
		
		t.join(1000);
		
		System.out.println("Joining after 1000"+" milliseconds: \n");
		System.out.println("Current Thread: "+t.getName());
		System.out.println("Is Alive? "+t.isAlive());
	}

}
