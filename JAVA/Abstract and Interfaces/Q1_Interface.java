package abstractAndInterfaces;

interface AA
{
	void showA();
}

interface BB
{
	void showB();
}

interface CC extends AA,BB
{
	void showC();
}
public class Q1_Interface implements C{
	
	public void showC()
	{
		System.out.println("Interface C");
	}
	
	public void showB()
	{
		System.out.println("Interface B");
	}
	
	public void showA()
	{
		System.out.println("Interface A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1_Interface q1 = new Q1_Interface();
		q1.showA();
		q1.showB();
		q1.showC();
	}

}
