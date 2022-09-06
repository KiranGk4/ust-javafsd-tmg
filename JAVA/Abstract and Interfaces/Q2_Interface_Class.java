package abstractAndInterfaces;

interface A_a
{
	void showA();
}
interface B_b
{
	void showB();
}
public class Q2_Interface_Class implements A_a, B_b{
	
	public void showA()
	{
		System.out.println("Interface A");
	}
	
	public void showB()
	{
		System.out.println("Interface B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2_Interface_Class q2 = new Q2_Interface_Class();
		q2.showA();
		q2.showB();
	}

}
