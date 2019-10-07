package lab5.prob1;

public class MuteQuack implements QuackBehaviour{
	@Override
	public void quack() {
		System.out.println("  Can not quack");
	}
}
