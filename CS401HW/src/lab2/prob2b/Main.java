package lab2.prob2b;

public class Main {
	public static void main(String[] args) {
		Order o1 = new Order("Firstline", 100.0, 10);
		o1.addOrderLine("Secondline", 90.0, 110);
		o1.addOrderLine("Thirdline", 80.0, 120);
		
		Order o2 = new Order("Line1", 100.0, 10);
		o2.addOrderLine("Line2", 90.0, 110);
		o2.addOrderLine("Line3", 80.0, 120);
		
		
		for(OrderLine o : o1.getOrderLine())
			System.out.println("OrderID: " + o1.getOrderId() + "," + o.toString());
		for(OrderLine o : o2.getOrderLine())
			System.out.println("OrderID: " + o2.getOrderId() + "," + o.toString());
	}

}
