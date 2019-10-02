package lab2.prob4;
import java.util.*;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class NewMain {	
	

	
	public static void main(String[] args) { 
		
		StudentSectionFactory ssf = new StudentSectionFactory();
		
		Student bob = ssf.createStudent("Bob");
		Student tim = ssf.createStudent("Tim");
		Student allen = ssf.createStudent("Allen");
		Student[] students = {bob, tim, allen};
		Section bio1 = ssf.createSection(1, "Biology");
		Section bio2 = ssf.createSection(2, "Biology");
		Section math = ssf.createSection(3, "Mathematics");
		
		ssf.newTranscriptEntry(bob, bio1, "A");
		ssf.newTranscriptEntry(bob, math, "b");
		ssf.newTranscriptEntry(tim, bio1, "B+");
		ssf.newTranscriptEntry(tim, math, "A-");
		ssf.newTranscriptEntry(allen, math, "B");
		ssf.newTranscriptEntry(allen, bio2, "B+");		
		
		System.out.println(getTranscript(bob));
		System.out.println("Grades for math section:\n " + getGrades(math));
		System.out.println("Courses that Tim took: " + getCourseNames(tim));
		System.out.println("Students who got A's: " + getStudentsWith("A", students));
	}
	
	private static Transcript getTranscript(Student s) {
		return s.getTranscript();
	}
	private static List<String> getCourseNames(Student s) {
		List<TranscriptEntry> all = s.grades;
		List<String> courseNames = new ArrayList<>();
		for(TranscriptEntry te : all) {
			courseNames.add(te.section.courseName);
		}
		return courseNames;
	}
	private static List<String> getGrades(Section s) {
		List<String> grades  = new ArrayList<>();
		for(TranscriptEntry t : s.gradeSheet) {
			grades.add(t.grade);
		}
		return grades;
	}
	private static List<String> getStudentsWith(String grade, Student[] students) {
		List<String> studentNames = new ArrayList<>();
		for(Student s : students) {
			boolean found = false;
			for(TranscriptEntry te : s.grades) {
				if(!found) {
					if(te.grade.equals(grade)) {
						found = true;
						studentNames.add(s.name);
					}
				}
			}
		}
		return studentNames;
	}
	
}
