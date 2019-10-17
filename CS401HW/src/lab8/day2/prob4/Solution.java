package lab8.day2.prob4;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		Arrays.sort(names,String::compareToIgnoreCase);
		for (String e : names)
			System.out.println(e);
	}

}
