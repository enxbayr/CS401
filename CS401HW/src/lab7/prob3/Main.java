package lab7.prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = {new MallardDuck(), new RedHeadDuck(), new RubberDuck(), new DecoyDuck()};
		
		for(Duck d : ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.fly();
			d.swim();
			d.display();
			d.quack();
		}
	}

}
