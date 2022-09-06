package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("ArrayList: "+numbers);
		
		Iterator<Integer> iterate = numbers.iterator();
		
		int number = iterate.next();
		System.out.println("Accessed Element: "+number);
		
		iterate.remove();
		System.out.println("Removed Element: "+number);
		System.out.println("Updated Arraylist: ");
		
		while(iterate.hasNext()) {
			iterate.forEachRemaining((value)-> System.out.println(value + ","));
			
		}
	}

}
