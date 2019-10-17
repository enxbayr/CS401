package lab8.day2.prob3;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		System.out.println("TASK A:");
		fruits.forEach((f) -> System.out.println(f));
		
		System.out.println("TASK B:");
		fruits.forEach(System.out::println);
	}

}
