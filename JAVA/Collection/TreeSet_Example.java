package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		System.out.println("TreSet: "+numbers);
		
		Iterator<Integer> iterate = numbers.iterator();
		System.out.print("TreeSet using Iterator: ");
		
		while(iterate.hasNext())
		{
			System.out.print(iterate.next());
			if(iterate.hasNext())System.out.print(",");
		}
	}

}
