package lab10.prob1;
import java.util.*;

public class GroupUtil {
	//Fix this code
	
	public static Group<?> copy(Group<?> group) {
		return copyHelper(group);
	}
	
	public static <T> Group<T> copyHelper(Group<T> group) {
		List<T> elements = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
		return grp;
	}
	
	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list0 = Arrays.asList(0,1,2,3,4);
		Group<Integer> group0 = new Group<>(0, list0);
		
		List<String> list1 = Arrays.asList("C++","C#", "Java","Kotlin");
		Group<String> group1 = new Group<>("Java", list1);
		
		System.out.println(group0);
		System.out.println(GroupUtil.copy(group0));
		
		System.out.println(group1);
		System.out.println(GroupUtil.copy(group1));

	}
}
