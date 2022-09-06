package abstractAndInterfaces;
abstract class Animals3
{
	abstract void makeSound();
	 public void eat()
	 {
		 System.out.println(" I can eat.");
	 }
}

class Dogs3 extends Animals3
{
	public void makeSound()
	{
		System.out.println("Bark bark");
	}
}
public class Sample_Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs3 d = new Dogs3();
		d.makeSound();
		d.eat();
	}

}
