package lab5.prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(vehicleFactory.getVehicle("Bus"));
		vehicles.add(vehicleFactory.getVehicle("Truck"));
		vehicles.add(vehicleFactory.getVehicle("Car"));
		vehicles.add(vehicleFactory.getVehicle("ElectricCar"));
		
		vehicles.forEach((v) -> v.startEngine());
	}
}
