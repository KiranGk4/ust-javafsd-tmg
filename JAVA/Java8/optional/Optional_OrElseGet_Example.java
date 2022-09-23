package java8.optional;

import java.util.Optional;

public class Optional_OrElseGet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> emptyOption = Optional.empty();
		Optional<String> strOption = Optional.of("One");
		System.out.println(emptyOption.orElseGet(()->"Optional null orElseGet"));
		System.out.println(strOption.orElseGet(()->"Optional value orElseGet"));
	}

}
