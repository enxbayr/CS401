package lab8.day2.prob2;

import java.util.function.Supplier;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> rndm = Math::random;
		
		System.out.println(rndm.get());
	}

}
