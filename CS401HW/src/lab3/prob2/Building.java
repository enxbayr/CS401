package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String bNum;
	private List<Apartment> apartments;
	private LandLord owner;
	private double cost;
	
	public Building(String bNum, LandLord owner, double cost){
		this.bNum = bNum;
		this.owner = owner;
		this.cost = cost;
		apartments = new ArrayList<Apartment>();
	}
	
	public void addApt(String num, double rent) {
		apartments.add(new Apartment(num, this,rent));
	}
	
	public double calculateRent() {
		double totalRent = 0.0;
		for(Apartment a : apartments)
			totalRent += a.getRent();
		return totalRent;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public LandLord getOwner() {
		return owner;
	}
	
	public void setOwner(LandLord owner) {
		this.owner = owner;
	}
	
	public double getCost() {
		return cost;
	}
	
	@Override
	
	public String toString() {
		return "Building ID: " + bNum + " [ " + "Total Rent: " + calculateRent() + 
				", " + "Cost: " + getCost() + "]" + '\n';
	}

}
