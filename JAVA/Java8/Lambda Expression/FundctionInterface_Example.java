package java8.lambda;

@FunctionalInterface
interface MyInterface
{
	double getPiValue();
}

public class FundctionInterface_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface ref;
		ref = ()->3.14;
		System.out.println("Value of Pi: "+ref.getPiValue());
	}

}
