package abstractAndInterfaces;
abstract class Languages
{
	public void display()
	{
		System.out.println("This is Java Programming.");
	}
}

public class Sample_Abstract extends Languages{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample_Abstract obj = new Sample_Abstract();
		obj.display();
	}

}
