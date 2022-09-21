package java8.lambda;

interface Adable
{
	int add(int a, int b);
}
public class LambdaExpression_Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adable ad1 = (a,b)->(a+b);
		System.out.println(ad1.add(10,20));
		
		Adable ad2 = (int a, int b)->{
			return a+b;
		};
		System.out.println(ad2.add(100,200));

	}

}
