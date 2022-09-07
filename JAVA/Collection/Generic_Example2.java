package collection;

class Test1<T>
{
	T obj;
	Test1(T obj)
	{
		this.obj = obj;
	}
	
	public T getObject()
	{
		return this.obj;
	}
}
public class Generic_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1<Integer> iObj = new Test1(15);
		System.out.println(iObj.getObject());
		
		Test1<String> sObj = new Test1<String>("GFG");
		System.out.println(sObj.getObject());
		//iObj = sObj;
	}

}
