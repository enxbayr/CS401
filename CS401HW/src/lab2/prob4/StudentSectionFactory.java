package lab2.prob4;

import java.util.ArrayList;

public class StudentSectionFactory {
	
	public Section createSection(int secNum, String courseName) {
		
		Section sec = new Section();
		
		sec.courseName = courseName;
		sec.sectionNumber = secNum;
		
		sec.gradeSheet = new ArrayList<TranscriptEntry>();
		
		return sec;
	}
	public Student createStudent(String name) {
		
		Student stu = new Student();
		
		stu.name = name;
		stu.grades = new ArrayList<TranscriptEntry>();
		
		return stu;
	}
	public void newTranscriptEntry(Student s, Section sect, String grade) {
		TranscriptEntry trns = new TranscriptEntry();
		trns.student = s;
		trns.section = sect;
		trns.grade = grade;
		s.grades.add(trns);
		sect.gradeSheet.add(trns);
	}

}
