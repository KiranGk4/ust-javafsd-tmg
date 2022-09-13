package exceptions;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		try
		{
			System.out.println(a[5]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
		
	}

}
