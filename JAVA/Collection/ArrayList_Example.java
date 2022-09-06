package collection;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<String>();
		
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("C++");
		System.out.println("ArrayList: "+languages);
		
		languages.set(2, "JavaScript");
		System.out.println("Modified ArrayList: "+languages);
	}

}
