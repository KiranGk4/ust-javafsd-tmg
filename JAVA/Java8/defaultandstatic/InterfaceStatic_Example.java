package java8.defaultandstatic;

interface Sayable1
{
	default void say()
	{
		System.out.println("hello, this is default method");
	}
	void sayMore(String msg);
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class InterfaceStatic_Example implements Sayable1{
	
	public void sayMore(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceStatic_Example dm = new InterfaceStatic_Example();
		dm.say();
		dm.sayMore("Work is worship");
		Sayable1.sayLouder("Hello...");
	}

}
