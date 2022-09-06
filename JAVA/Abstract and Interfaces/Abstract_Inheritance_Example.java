package abstractAndInterfaces;

abstract class Animal
{
	abstract void makeSound();
	
	public void eat()
	{
		System.out.println("I can eat");
	}
}

class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Bark BArk");
	}
}
public class Abstract_Inheritance_Example {
	public static void main(String args[])
	{
		Dog dog1 = new Dog();
		dog1.makeSound();
		dog1.eat();
	}

}
