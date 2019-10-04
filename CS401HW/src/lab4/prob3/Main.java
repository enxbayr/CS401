package lab4.prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();
		Hourly h1 = new Hourly("1", 50, 40);
		Hourly h2 = new Hourly("2", 50, 40);
		Commissioned c1 = new Commissioned("3", 0.05,  5000);
		Commissioned c2 = new Commissioned("4", 0.1, 6000);
		Salaried s1 = new Salaried("5", 7000);
		Salaried s2 = new Salaried("6", 8000);
		
		Order o1 = new Order("1", LocalDate.now(), 3000);
		Order o2 = new Order("2", LocalDate.of(2019, 8, 15), 3000);
		Order o3 = new Order("3", LocalDate.of(2019, 9, 15), 4000);
		Order o4 = new Order("4", LocalDate.of(2019, 9, 10), 5000);
		Order o5 = new Order("5", LocalDate.of(2019, 10, 1), 6000);
		Order o6 = new Order("6", LocalDate.of(2019, 8, 15), 7000);
		Order o7 = new Order("7", LocalDate.of(2019, 9, 15), 8000);
		Order o8 = new Order("8", LocalDate.of(2019, 7, 15), 9000);
		Order o9 = new Order("9", LocalDate.of(2019, 7, 15), 10000);
		Order o10 = new Order("10", LocalDate.of(2019, 7, 15), 11000);
		
		c1.addOrder(o1);
		c1.addOrder(o2);
		c1.addOrder(o3);
		c1.addOrder(o4);
		c1.addOrder(o5);
		c2.addOrder(o6);
		c2.addOrder(o7);
		c2.addOrder(o8);
		c2.addOrder(o9);
		c2.addOrder(o10);
		
		empList.add(h1);
		empList.add(h2);
		empList.add(c1);
		empList.add(c2);
		empList.add(s1);
		empList.add(s2);
		for(Employee e: empList)
			e.print(2019, 8);

	}

}
