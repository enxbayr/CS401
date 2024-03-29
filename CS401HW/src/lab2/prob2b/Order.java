package lab2.prob2b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private static int autoInc = 1;
	private int orderId;
	private LocalDate orderDate;
	private List<OrderLine> orderLines = new ArrayList<OrderLine>();
	
	Order(String linenum, Double price, int quantity){
		this.orderId = autoInc;
		this.orderDate = LocalDate.now();
		this.orderLines.add(new OrderLine(linenum, price, quantity, this));
		autoInc++;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public List<OrderLine> getOrderLine() {
		return orderLines;
	}

	public void addOrderLine(String linenum, Double price, int quantity) {
		this.orderLines.add(new OrderLine(linenum, price, quantity, this));
	}

}
