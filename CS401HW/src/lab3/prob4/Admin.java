package lab3.prob4;

import java.util.List;

public class Admin {
	public static double computeTotalRent(List<Rentable> properties) {
		double totalRent = 0;
		for (Rentable o : properties) {
			totalRent += o.computeRent();	
		}
		return totalRent;
	}
}
