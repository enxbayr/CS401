package lab5.prob1;

public class RubberDuck extends Duck{
	public RubberDuck() {
		super(new CanNotFly(), new Squeak());
	}
	@Override
	public void display() {
		System.out.println("  Displaying");
	}
}
