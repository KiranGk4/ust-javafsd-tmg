package java8.method_reference;

import java.util.function.BiFunction;

class Arithmetic
{
	public int add(int a, int b) {
		return a+b;
	}
}
public class InstanceMethodReference_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}

}
