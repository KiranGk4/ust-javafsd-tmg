package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> values = new TreeMap<>();
		
		values.put("Second", 2);
		values.put("First",1);
		System.out.println("Map using Treemap: "+values);
		
		values.replace("First",11);
		values.replace("Second", 22);
		System.out.println("New map: "+values);
		
		int removedVal = values.remove("First");
		System.out.println("Removed value: "+removedVal);
		
		System.out.println(values);
	}

}
