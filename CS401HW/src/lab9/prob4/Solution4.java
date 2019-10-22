package lab9.prob4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution4 {
	
	public static void printSquares(int num) {
		List<Integer> list = Stream.iterate(1, n -> (int) Math.pow(Math.sqrt(n) + 1, 2))
				.limit(num)
				.collect(Collectors.toList());
		System.out.println(list);
	}
	public static void main(String[] args) {
		printSquares(5);
	}
}
