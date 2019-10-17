package lab8.day2.prob2;

import java.util.function.Supplier;

public class Random3 {

	static class FindRandom implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}

	}

	public static void main(String[] args) {
		FindRandom fr = new FindRandom();
		System.out.println(fr.get());
	}

}
