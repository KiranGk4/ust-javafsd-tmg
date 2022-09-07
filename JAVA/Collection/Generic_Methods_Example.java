package collection;

class GenericsType<T>
{
	T g;
	public void set(T g1)
	{
		this.g = g1;
	}
	
	public T get()
	{
		return this.g;
	}
}
public class Generic_Methods_Example {
	

	public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2)
	{
		return g1.get().equals(g2.get());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsType<String> g1 = new GenericsType<>();
		g1.set("Pankaj");
		
		GenericsType<String> g2 = new GenericsType<>();
		g2.set("Pankaj");
		
		boolean isEqual = Generic_Methods_Example.<String>isEqual(g1, g2);
		
		isEqual = Generic_Methods_Example.isEqual(g1, g2);
		System.out.println(isEqual);
	}

}
