package lab9.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	 public static final TriFunction<List<Employee>, Character, Character, String> EMPLOYEES_100000 
		= (list, ch1, ch2) 
		     -> list.stream()
		     	.filter(e -> e.getSalary() > 100000)
				.filter(e -> e.getLastName().charAt(0) >= ch1)
				.filter(e -> e.getLastName().charAt(0) <= ch2)
				.map((e) -> e.getFirstName() + " " + e.getLastName())
				.collect(Collectors.joining(","));
}
