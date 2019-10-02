package lab2.prob2a;

public class Student {
	private String name;
	private GradeReport graderep;
	
	Student(String name){
		this.name = name;
		this.graderep = new GradeReport(this);
	}
	
	public String getName() {
		return name;
	}
	public GradeReport getGradeRep() {
		return graderep;
	}
	
	@Override
	public String toString() {
		return name;
	} 
	
}
