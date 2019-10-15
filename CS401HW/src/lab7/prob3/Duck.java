package lab7.prob3;

public abstract class Duck implements FlyBehaviour, QuackBehaviour{
	public void swim() {
		System.out.println("  Swimming");
	}
	public abstract void display();
}
