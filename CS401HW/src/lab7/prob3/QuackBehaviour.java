package lab7.prob3;

public interface QuackBehaviour {
	public default void quack() {
		System.out.println("  Quacking");
	}
}
