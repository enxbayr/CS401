package lab5.prob3;

public class VehicleFactory {
	   public Vehicle getVehicle(String vehicleType){
		      if(vehicleType == null){
		         return null;
		      }		
		      if(vehicleType.equalsIgnoreCase("Bus")){
		         return new Bus();
		         
		      } else if(vehicleType.equalsIgnoreCase("Truck")){
		         return new Truck();
		         
		      } else if(vehicleType.equalsIgnoreCase("Car")){
		         return new Car();
		         
		      } else if(vehicleType.equalsIgnoreCase("ElectricCar")){
			         return new ElectricCar();
			      }      
		      return null;
		   }
}
