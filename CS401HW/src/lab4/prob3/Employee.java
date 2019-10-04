package lab4.prob3;

public abstract class Employee {
	private String empId;
	
	public Employee(String empId) {
		this.empId = empId;
	}
	
	public void print(int y, int m){
		System.out.println("EmployeeID: " + empId);
		calcCompensation(y, m).print();
		
	}
	
	public Paycheck calcCompensation(int y, int m) {
		
		Paycheck paychech = new Paycheck(calcGrossPay(y, m), 0.23, 0.05, 0.01, 0.03, 0.075);
		
		return paychech;
	}
	
	public abstract double calcGrossPay(int y, int m);

}
