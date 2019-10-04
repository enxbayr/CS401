package lab4.prob3;

public final class Paycheck {
	private final double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double ssn) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = ssn;
	}
	
	public void print() {
		System.out.println(toString());

	}
	
	public double getNetPay() {
		return grossPay - grossPay*(fica + state + local + medicare + socialSecurity);
	}
	
	@Override
	public String toString()
	{
		return "Paystub: \n "
				+ "  Gross Pay: " + grossPay + "\n"
				+ "  Fica: " + fica  + "\n" 
				+ "  State: " + state  + "\n" 
				+ "  Local: " + local  + "\n" 
				+ "  Medicare: " + medicare  + "\n" 
				+ "  Social Security: " + socialSecurity  + "\n" 
				+ "  NET PAY: " + getNetPay() + '\n';
	}
	
}
