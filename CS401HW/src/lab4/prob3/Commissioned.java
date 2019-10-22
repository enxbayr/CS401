package lab4.prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	public Commissioned (String empId, double comm, double bsal) {
		super(empId);
		this.commission = comm;
		this.baseSalary = bsal;
		orders = new ArrayList<Order>();
	}
	
	public void addOrder(Order or) {
		orders.add(or);
	}
	
	public List<Order> getOrders(){
		return orders;
	}
	
	@Override
	public double calcGrossPay(int y, int m) {
		// TODO Auto-generated method stub
		
		double orderAmount = 0.0;
		
		LocalDate dd = LocalDate.of(y, m, 1);
		dd = dd.minusMonths(1);
		for(Order o : orders) {
			if(o.getDate().getMonthValue() == dd.getMonthValue() && o.getDate().getYear() == dd.getYear())
				orderAmount += o.getAmount();
		}
		
		return baseSalary + orderAmount*commission;
	}

}
