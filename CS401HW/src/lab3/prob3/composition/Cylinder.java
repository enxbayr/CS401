package lab3.prob3.composition;

public class Cylinder {
	private double height;
	private Circle circle;
	
	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	public double computeVolume() {
		return height*circle.computeArea();
	}
	
}
