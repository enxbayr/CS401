package lab2.prob2b;

public class OrderLine {
	private String linenum;
	private Double price;
	private int quantity;
	private Order order;
	
	OrderLine(String linenum, Double price, int quantity, Order order){
		this.linenum = linenum;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "ORDER DATE: " + order.getOrderDate().toString() + ", " 
				+ "LINENAME: " + linenum + ", " + "PRICE: " + price + ", "
				+ "QUANTITY: " + quantity;
	}

}
