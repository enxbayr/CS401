package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
	private String name;
	private List<Building> buildings;
	
	public LandLord(String name){
		this.name = name;
		buildings = new ArrayList<Building>();
	}
	
	public void addBuilding(String bNum, double cost) {
		buildings.add(new Building(bNum, this, cost));
	}
	
	public String getName() {
		return name;
	}
	
	public List<Building> getBuildings(){
		return buildings;
	}
	
	public double calculateProfit() {
		double tRent = 0.0;
		double tCost = 0.0;
		
		for(Building b : buildings) {
			tRent += b.calculateRent();
			tCost += b.getCost();
		}
		
		return tRent - tCost;
	}

}
