package lab3.prob1.solution;


public class Person {

	private String name;
	
	Person(String n) {
		name = n;
	}
	
	Person(String n, Double s) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		boolean isEqual = false;
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) {
			return false;
		}
		
		if(aPerson instanceof Person) {
			Person p = (Person)aPerson;
			isEqual = this.getName().equals(p.getName());
		}

		return isEqual;
	}
}
