package lab5.prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(VehicleFactory.getVehicle("Bus"));
		vehicles.add(VehicleFactory.getVehicle("Truck"));
		vehicles.add(VehicleFactory.getVehicle("Car"));
		vehicles.add(VehicleFactory.getVehicle("ElectricCar"));
		
		vehicles.forEach((v) -> v.startEngine());
	}
}
