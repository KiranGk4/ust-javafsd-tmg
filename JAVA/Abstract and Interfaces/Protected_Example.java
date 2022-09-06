package abstractAndInterfaces;

class Animals2
{
	protected String name;
	
	protected void display()
	{
		System.out.println("I am an animal.");
	}
}

class Dogs2 extends Animals2
{
	public void getInfo()
	{
		System.out.println("My name is "+name);
	}
}
public class Protected_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs2 labrador = new Dogs2();
		
		labrador.name = "Rocky";
		labrador.display();
		
		labrador.getInfo();
	}

}
