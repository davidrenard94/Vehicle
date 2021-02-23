import java.util.ArrayList;

/**
 * 
 */

/**
 * @author David Renard
 *
 */
public class VehicleTester {

	/**
	 * 
	 */
   public static void main(String[] args) {
	   
	   
	   ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
	   
	   vehicle.add(new Car(120, 4, "Blue", 2));
	   vehicle.add(new Truck(260, 4, 1500, 2));
	   vehicle.add(new Car(350, 4, "Yellow", 4));
	   vehicle.add(new Truck(560, 4, 4500, 4));
	   
	   for (Vehicle v: vehicle ) 
	   {
		   System.out.println(v);
		    
	   }
	   
//	   Vehicle myVehicle = new Vehicle(3000,4);
//	   
//	   System.out.println("The horsepower is " + myVehicle.getHorsepower());
//	   System.out.println(myVehicle.toString());
//	   
//	   Car myCar = new Car(2500, 4, "Blue", 4);
//	   System.out.println(myCar);
//	   
//	   Truck myTruck = new Truck(7000, 4, 33895, 2);
//	   System.out.println(myTruck);
		
	}

}
