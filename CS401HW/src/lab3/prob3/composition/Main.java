package lab3.prob3.composition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir = new Circle(5);
		Cylinder cyr = new Cylinder(cir, 6);
		
		System.out.println("Circle's area: " + cir.computeArea());
		System.out.println("Cylinder's volume: " + cyr.computeVolume());

	}

}
