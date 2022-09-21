package java8.functioninterface;

@FunctionalInterface
interface Sayable
{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterface_Example {

	public void say(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface_Example fie = new FunctionalInterface_Example();
		fie.say("Hello there");
	}

}
