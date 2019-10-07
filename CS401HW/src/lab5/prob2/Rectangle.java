package lab5.prob2;

public final class Rectangle implements Figure{
	private final double length;
	private final double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	@Override
	public double computeArea() {
		return length*width;
	}
}
