package lab8.day1.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class bifunction {

	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> bf = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add((double) (x * y));
			return list;
		};
		List<Double> res = bf.apply(2.0, 3.0);
		System.out.println(res);
	}
}
