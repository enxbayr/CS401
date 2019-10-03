package lab3.prob1.solution;

public class PersonWithJob {
	
	private Person person;
	private double salary;
	
	PersonWithJob(String name, double s) {
		this.person = new Person(name);
		salary = s;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		boolean isEqual = false;
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) {
			return false;
		}
		
		if(aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob)aPerson;
			isEqual = this.getPerson().equals(p.getPerson());

		}
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe", 40000);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
