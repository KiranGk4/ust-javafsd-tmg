package collection;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m = new HashMap<String, Integer>();
		
		m.put("One",1);
		m.put("Two", 2);
		System.out.println("Map: "+m);
		
		System.out.println("Keys: "+m.keySet());
		
		System.out.println("Values: "+m.values());
		
		System.out.println("Entries: "+m.entrySet());
		
		int value = m.remove("Two");
		System.out.println("Removed Value: "+value);
		
		System.out.println(m);
	}

}
