package lab4.prob3;

public class Salaried extends Employee {
	private double salary;

	public Salaried(String empId, double sal) {
		super(empId);
		this.salary = sal;
	}
	
	@Override
	public double calcGrossPay(int y, int m) {
		// TODO Auto-generated method stub
		return salary;
	}
}
