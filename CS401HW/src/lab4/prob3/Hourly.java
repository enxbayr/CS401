package lab4.prob3;

public class Hourly extends Employee{
	private double hourlyWage;
	private double hoursPerWeek;
	
	public Hourly(String empId, double hw, double hpw) {
		super(empId);
		this.hourlyWage = hw;
		this.hoursPerWeek = hpw;
	}
	
	@Override
	public double calcGrossPay(int y, int m) {
		// TODO Auto-generated method stub
		return 4*hourlyWage*hoursPerWeek;
	}
	
}
