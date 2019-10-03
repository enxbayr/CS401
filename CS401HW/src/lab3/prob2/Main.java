package lab3.prob2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LandLord bold = new LandLord("Bold");
		
		bold.addBuilding("B1", 200.0);
		bold.addBuilding("B2", 300.0);
		
		bold.getBuildings().get(0).addApt("Apt1", 100);
		bold.getBuildings().get(0).addApt("Apt2", 100);
		bold.getBuildings().get(0).addApt("Apt3", 100);
		bold.getBuildings().get(0).addApt("Apt4", 100);
		
		bold.getBuildings().get(1).addApt("Apt1", 100);
		bold.getBuildings().get(1).addApt("Apt2", 100);
		bold.getBuildings().get(1).addApt("Apt3", 100);
		bold.getBuildings().get(1).addApt("Apt4", 100);
		bold.getBuildings().get(1).addApt("Apt5", 100);
		
		
		System.out.println("LandLord: " + bold.getName() + ", " + "TOTAL REGVENUE: " + bold.calculateProfit());
		

	}

}
