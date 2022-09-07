package collection;

class GenericClass<T>
{
	private T data;
	
	public GenericClass(T data)
	{
		this.data = data;
	}
	public T getData()
	{
		return this.data;
	}
}
public class Generics_Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> intObj = new GenericClass<>(5);
		System.out.println("Generic Class return: "+intObj.getData());
		
		GenericClass<String> stringObj = new GenericClass<>("Java Programming");
		System.out.println("Generic class returns: "+stringObj.getData());
	}

}
