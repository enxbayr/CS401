package lab7.prob3;

public interface FlyBehaviour {
	public default void fly() {
		System.out.println("  Fly with wings");
	}
}
