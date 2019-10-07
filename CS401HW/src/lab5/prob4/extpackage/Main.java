package lab5.prob4.extpackage;

import java.time.LocalDate;

import lab5.prob4.Customer;
import lab5.prob4.CustOrderFactory;
import lab5.prob4.Order;

public class Main {
	public static void main(String[] args) {
		/*
		 * Customer cust = new Customer("Bob"); Order order = Order.newOrder(cust,
		 * LocalDate.now()); order.addItem("Shirt"); order.addItem("Laptop");
		 * 
		 * order = Order.newOrder(cust, LocalDate.now()); order.addItem("Pants");
		 * order.addItem("Knife set");
		 * 
		 * System.out.println(cust.getOrders());
		 */
		
		Customer bold = CustOrderFactory.createCustomer("Bold");
		Order or1 = CustOrderFactory.newOrder(bold, LocalDate.now());
		CustOrderFactory.addItem(or1, "Laptop");
		CustOrderFactory.addItem(or1, "Chair");
		CustOrderFactory.addItem(or1, "Table");
		
		System.out.println(bold.getOrders());
		
	}
}

		
