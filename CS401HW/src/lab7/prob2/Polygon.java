package lab7.prob2;

public interface Polygon extends ClosedCurve {
	public double[] getSides();
	public default double computePerimeter() {
		double[] sides = getSides();
		double perimeter = 0.0;
		for(double s : sides)
			perimeter += s;
		return perimeter;
	}
}
