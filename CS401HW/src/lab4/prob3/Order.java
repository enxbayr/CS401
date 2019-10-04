package lab4.prob3;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmount;

	public Order(String on, LocalDate od, double oa) {
		this.orderNo = on;
		this.orderDate = od;
		this.orderAmount = oa;
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	
	public LocalDate getDate() {
		return orderDate;
	}
	
	public double getAmount() {
		return orderAmount;
	}
}
