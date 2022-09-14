package threads;

public class Thread3 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t3 = new Thread3();
		try
		{
			System.out.println("Hello");
			t3.sleep(5000);
			System.out.println("hi");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
