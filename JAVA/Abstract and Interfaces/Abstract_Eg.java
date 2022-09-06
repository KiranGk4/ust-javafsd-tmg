package abstractAndInterfaces;

abstract class Abstract1
{
	int age;
	String name, address;
	void display()
	{
		System.out.println(age +" "+address+" "+name);
	}
	
	void show()
	{
		
	}
	
	abstract float calculate();
}
public class Abstract_Eg extends Abstract1{
	float calculate()
	{
		return 0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
