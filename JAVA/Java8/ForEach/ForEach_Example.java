package java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Ankit");
		list.add("Mayank");
		list.add("Irfan");
		list.add("jai");
		
		list.forEach(
				(n)->System.out.println(n)
				);
	}

}
