package abstractAndInterfaces;

abstract class Language
{
	public void display()
	{
		System.out.println("This is Java Programming");
	}
}
public class Abstract_Example extends Language{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Example ae = new Abstract_Example();
		ae.display();
	}

}
