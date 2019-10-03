package lab3.prob4;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	// Composition multiple roles 
	private List<Rentable> rentingList;
	public Driver()
	{
		rentingList = new ArrayList<Rentable>();
	}
	public static void main(String[] args) {
		Driver d = new Driver();
		d.rentingList =  new ArrayList<Rentable>();
		House h = new House(3, new Address("1000", "Fairfield", "IA", "52556"));
		House h1 = new House(4, new Address("1000", "Chicago", "IL", "53555"));
		Condo c = new Condo(3, new Address("1000", "Seatle", "WA", "52556"));
		Condo c1 = new Condo(5, new Address("1000", "Los Angeles", "CA", "52556"));
		Trailer t = new Trailer(new Address("1000", "San francisco", "CA", "52556"));
		Trailer t1 = new Trailer(new Address("1000", "Denver", "Colorado", "52556"));
		
		d.rentingList.add(h);
		d.rentingList.add(h1);
		d.rentingList.add(c);
		d.rentingList.add(c1);
		d.rentingList.add(t);
		d.rentingList.add(t1);
		
		double totalRent = Admin.computeTotalRent(d.rentingList);
		System.out.println(totalRent);
	}

}
