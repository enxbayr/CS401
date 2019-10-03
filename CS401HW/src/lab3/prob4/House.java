package lab3.prob4;

public class House implements Rentable{
	private double lotSize;
	private Address addr;
	public House(double lotSize, Address addr)
	{
		this.lotSize = lotSize;
		this.addr = addr;
	}
	@Override
	public double computeRent()
	{
		return lotSize * 0.1;
	}
	
	public Address getAddress()
	{
		return this.addr;
	}
}
