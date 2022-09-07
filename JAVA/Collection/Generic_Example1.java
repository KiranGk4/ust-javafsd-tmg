package collection;

class Test<T, U>
{
	T obj1;
	U obj2;
	
	Test(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
public class Generic_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test<String, Integer> obj = new Test<String, Integer>("GFG", 15);
		obj.print();
	}

}
