package collection;

import java.util.ArrayList;
import java.util.List;

public class List_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List: "+numbers);
		
		int number = numbers.get(2);
		System.out.println("Accessed Element: "+number);
		
		int removedNumber = numbers.remove(1);
		System.out.println("Removed Element: "+removedNumber);
		
		System.out.println(numbers);
	}

}
