package lab3.prob4;

public class Condo implements Rentable{
	private Address addr;
	private int numFloors;
	public Condo(int numFloors, Address addr)
	{
		this.addr = addr;
		this.numFloors = numFloors;
	}
	public Address getAddress()
	{
		return this.addr;
	}
	@Override
	public double computeRent()
	{
		return numFloors * 400;
	}
	
}