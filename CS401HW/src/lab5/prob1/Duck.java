package lab5.prob1;

public abstract class Duck {
	FlyBehaviour fb;
	QuackBehaviour qb;
	public Duck(FlyBehaviour fb, QuackBehaviour qb) {
		this.fb = fb;
		this.qb = qb;
	}
	public void swim() {
		System.out.println("  Swimming");
	}
	public abstract void display();
	public void fly() {
		fb.fly();
	}
	public void quack() {
		qb.quack();
	}
}
