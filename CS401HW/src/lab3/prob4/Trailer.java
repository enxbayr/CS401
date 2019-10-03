package lab3.prob4;

public class Trailer implements Rentable{
	private Address addr;
	public Trailer(Address addr)
	{
		this.addr = addr;
	}
	
	@Override
	public double computeRent()
	{
		return 400.0;
	}
	public Address getAddress()
	{
		return this.addr;
	}
}