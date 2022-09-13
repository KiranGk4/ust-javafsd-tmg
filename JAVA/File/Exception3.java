package exceptions;

public class Exception3 {
	
	public double calculate(int a, int b)throws Exception
	{
		//throw new Exception("abc");
		return (a+b);
	}
	
	void display(int x)throws Exception
	{
		if(x==5)throw new Exception();
		else
			System.out.println("n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception3 e = new Exception3();
		try
		{
			e.calculate(5, 6);
			e.display(5);
		}
		catch(Exception f)
		{
			f.printStackTrace();
		}
		
	}

}
