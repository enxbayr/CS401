package lab3.prob3;

public class Cylinder {
	private double height;
	private double radius;
	
	public Cylinder(double radius, double height) {
		//this.radius = radius;
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		return height*Math.PI*Math.pow(radius, 2);
	}

}
