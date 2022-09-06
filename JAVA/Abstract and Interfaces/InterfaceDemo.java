package abstractAndInterfaces;

interface A1
{
	void funA();
}

interface B1 extends A1
{
	void funB();
}

class C1 implements B1
{
	public void funA()
	{
		System.out.println("This is funcA.");
	}
	
	public void funB()
	{
		System.out.println("This is funcB");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1();
		obj.funA();
		obj.funB();
	}

}
