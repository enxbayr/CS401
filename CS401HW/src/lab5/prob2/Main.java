package lab5.prob2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure[] figures = {new Triangle(2.0,3.0), new Rectangle(3.0, 4.0), new Circle(5.0), 
							new Triangle(6.0,7.0), new Rectangle(1.0, 2.0), new Circle(3.0)};
		double totalArea = 0.0;
		
		for (Figure f : figures)
			totalArea += f.computeArea();
		System.out.println("TOTAL AREA: " + totalArea);
		
	}

}
