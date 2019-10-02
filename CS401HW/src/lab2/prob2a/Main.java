package lab2.prob2a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Anna");
		st1.getGradeRep().addGrade("A");
		st1.getGradeRep().addGrade("B");
		st1.getGradeRep().addGrade("C");
		Student st2 = new Student("Bob");
		st2.getGradeRep().addGrade("Ä");
		
		System.out.println(st1.toString() + st1.getGradeRep().getGrade());
		System.out.println(st2.toString() + st2.getGradeRep().getGrade());

	}

}
