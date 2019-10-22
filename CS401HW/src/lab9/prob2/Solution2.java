package lab9.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution2 {

	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(1,2,3,4,5);
		
		IntSummaryStatistics summary
		= myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		int maxInt = (int) summary.getMax();
		int minInt = (int) summary.getMin();	
		System.out.println("MAX: " + maxInt + " " + "MIN: " + minInt);

	}

}
