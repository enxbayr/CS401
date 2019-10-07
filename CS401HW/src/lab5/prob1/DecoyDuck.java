package lab5.prob1;

public class DecoyDuck extends Duck{
	public DecoyDuck() {
		super(new CanNotFly(), new MuteQuack());
	}
	@Override
	public void display() {
		System.out.println("  Displaying");
	}
}
