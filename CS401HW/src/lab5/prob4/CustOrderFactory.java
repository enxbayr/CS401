package lab5.prob4;

import java.time.LocalDate;

final public class CustOrderFactory {
	public static Customer createCustomer(String name) {
		return new Customer(name);
	}
	public static Order newOrder(Customer c, LocalDate d) {
		return Order.newOrder(c, d);
	}
	public static void addItem(Order o, String name) {
		o.addItem(name);
	}

}
