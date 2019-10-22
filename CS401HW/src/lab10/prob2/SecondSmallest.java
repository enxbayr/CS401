package lab10.prob2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondSmallest {

	public static<T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		
		List<T> slist = list.stream()
							.sorted((x,y) -> x.compareTo(y))
							.collect(Collectors.toList());
		Optional<T> sm = Optional.of(slist.get(1));
		return sm.isPresent()?sm.get():null;
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(11,20,312,4);
		List<String> list3 = Arrays.asList("A","B","C","D");
		List<String> list4 = Arrays.asList("John","Amy","Lee","Ben");
		System.out.println(secondSmallest(list1));
		System.out.println(secondSmallest(list2));
		System.out.println(secondSmallest(list3));
		System.out.println(secondSmallest(list4));

	}

}
