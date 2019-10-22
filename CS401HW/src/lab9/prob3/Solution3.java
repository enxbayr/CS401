package lab9.prob3;

import java.util.Arrays;
import java.util.List;

public class Solution3 {

	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter(w -> w.length() == len)
				.map(w -> w.toUpperCase()) 
				.filter(w -> w.contains(c+""))
				.filter(w -> !w.contains(d+""))
				.count();
	}
	public static void main(String[] args) {
		Solution3 sl = new Solution3();
		List<String> list = Arrays.asList("Bat", "Bold", "Bob", "Ariun", "Chimeg");
		System.out.println(sl.countWords(list, 'B', 'R', 3));
	}

}
