package lab8.day2.prob2;

import java.util.function.Supplier;

public class Random2 {
	public static void main(String[] args) {
		Supplier<Double> rndm = () -> Math.random();
		
		System.out.println(rndm.get());
	}
}
