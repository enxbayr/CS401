package lab9.prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution1 {

	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
		
		System.out.println(stringStream.collect(Collectors.joining(",")));		
	}

}
