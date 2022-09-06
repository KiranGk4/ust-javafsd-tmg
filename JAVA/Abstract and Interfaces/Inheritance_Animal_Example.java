package abstractAndInterfaces;

class Animals1
{
	public void eat()
	{
		System.out.println("I can eat.");
	}
}

class Dogs1 extends Animals1
{
	@Override
	public void eat()
	{
		super.eat();
		System.out.println("I eat dog food");
	}
	
	public void bark()
	{
		System.out.println("I can bark.");
	}
}
public class Inheritance_Animal_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs1 labrador = new Dogs1();
		labrador.eat();
		labrador.bark();
	}

}
