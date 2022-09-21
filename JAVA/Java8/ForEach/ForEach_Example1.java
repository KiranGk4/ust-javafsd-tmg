package java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEach_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gameList = new ArrayList<String>();
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("Chess");
		gameList.add("Hockey");
		System.out.println("--------------Iterating by passing lambda expression-------------");
		gameList.forEach(System.out::println);
	}

}
