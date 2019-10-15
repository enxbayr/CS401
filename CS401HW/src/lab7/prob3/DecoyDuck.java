package lab7.prob3;

public class DecoyDuck extends Duck{
	@Override
	public void fly() {
		System.out.println("  Can not fly");
	}
	@Override
	public void quack() {
		System.out.println("  Can not quack");
	}
	@Override
	public void display() {
		System.out.println("  Displaying");
	}
}
