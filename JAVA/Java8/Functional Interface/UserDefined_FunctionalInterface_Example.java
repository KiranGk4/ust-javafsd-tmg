package java8.functioninterface;

@FunctionalInterface
interface Square
{
	int calculate(int x);
}
public class UserDefined_FunctionalInterface_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		Square s = (int x)->(x*x);
		
		int ans = s.calculate(a);
		System.out.println(ans);
	}

}
