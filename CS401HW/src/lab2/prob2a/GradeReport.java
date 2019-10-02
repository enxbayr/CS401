package lab2.prob2a;

import java.util.ArrayList;
import java.util.List;

public class GradeReport {
	private Student studentName;
	private List<String> grades = new ArrayList<String>();
	
	GradeReport(Student name) {
		this.studentName = name;
	}
	
	public void addGrade(String grade) {
		grades.add(grade);
	}
	
	public List<String> getGrade(){
		return grades;
	}

}
