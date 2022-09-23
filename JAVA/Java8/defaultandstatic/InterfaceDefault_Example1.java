package java8.defaultandstatic;

interface Sayable
{
	default void say()
	{
		System.out.println("hello, this is default method");
	}
	void sayMore(String msg);
}
public class InterfaceDefault_Example1 implements Sayable{
	
	public void sayMore(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDefault_Example1 dm = new InterfaceDefault_Example1();
		dm.say();
		dm.sayMore("Work is worship");
	}

}
