package abstractAndInterfaces;
class Animals
{
	public void displayInfo()
	{
		System.out.println("I am an animal");
	}
}

class Dogs extends Animals
{
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("I am a dog.");
	}
}
public class Sample_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d1 = new Dogs();
		d1.displayInfo();
	}

}
