package lab3.prob3;

public class Circle extends Cylinder{
	private double radius;
	
	public Circle(double radius) {
		super(radius, 0.0);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeAreae() {
		return Math.PI*Math.pow(radius, 2);
	}

}
