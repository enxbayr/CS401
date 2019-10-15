package lab7.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format

		list.forEach((e) -> System.out.println(e.toUpperCase()));
		printConsumer(list);
	}

	// implement a Consumer
	public static void printConsumer(List<String> list) {
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		System.out.println("------using new forEach method------");
		list.forEach(consumer);
	}
}