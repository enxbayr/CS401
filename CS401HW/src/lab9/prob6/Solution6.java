package lab9.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution6 {
	
	public static Set<String> union(List<Set<String>> sets){
		Set<String> str = sets.stream()
				//.reduce((s1,s2) -> Stream.concat(s1.stream(),s2.stream()).collect(Collectors.toSet()))
				//.orElse(null);
				.reduce(new HashSet<String>(), (s1, s2) -> {s1.addAll(s2); return s1;});
		return str;

	}

	public static void main(String[] args) {
		List<Set<String>> list = new ArrayList<Set<String>>();
		list.add(new HashSet<String>(Arrays.asList("A","B")));
		list.add(new HashSet<String>(Arrays.asList("D")));
		list.add(new HashSet<String>(Arrays.asList("1","3","5")));
		Set<String> result = union(list);
		
		System.out.println(result);

	}

}
