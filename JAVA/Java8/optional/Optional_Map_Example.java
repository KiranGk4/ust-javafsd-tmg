package java8.optional;

import java.util.Optional;

public class Optional_Map_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> strOptional = Optional.of("ONE TWO THREE");
		Optional<String> strOptional1 = strOptional.map(String::toLowerCase);
		strOptional1.ifPresent(System.out::println);
	}

}
