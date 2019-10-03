package lab3.prob2;

public class Apartment {
	private String aptNum;
	private Building building;
	private double rent;
	
	public Apartment(String aptNum, Building building, double rent){
		this.aptNum = aptNum;
		this.building = building;
		this.rent = rent;
	}
	
	public double getRent() {
		return rent;
	}
	
	public String getAptNum() {
		return aptNum;
	}
	
	public Building getBuilding() {
		return building;
	}

}
