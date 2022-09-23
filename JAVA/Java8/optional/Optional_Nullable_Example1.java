package java8.optional;

import java.util.Optional;

public class Optional_Nullable_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Object> objOptional = Optional.ofNullable(null);
		System.out.println(objOptional.isPresent());
		Optional<String> strOptional = Optional.ofNullable("one");
		System.out.println(strOptional.isPresent());
	}

}
