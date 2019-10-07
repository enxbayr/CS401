package lab5.prob1;

public class RedHeadDuck extends Duck{
	public RedHeadDuck() {
		super(new FlyWithWings(), new Quack());
	}
	@Override
	public void display() {
		System.out.println("  Displaying");
	}
}
