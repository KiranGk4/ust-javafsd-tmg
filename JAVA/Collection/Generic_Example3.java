package collection;

class GenericClass1<T extends Number>
{
	public void display()
	{
		System.out.println("This is a bounded type generics class.");
	}
}
public class Generic_Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass1<Integer> obj = new GenericClass1<>();	//String is not working.
		obj.display();
	}

}
