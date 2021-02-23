/**
 * 
 */

/**
 * child class to vehicle 
 * 
 * @author David Renard
 *
 */
public class Truck extends Vehicle {
	
	private double cargoCapacity;
	private int numberOfDoors;

	/**
	 * 
	 */
	public Truck(double horsepower, int numberOfWheels, double newCapacity, int newDoors)
	
	{
		super(horsepower, numberOfWheels);
		
		cargoCapacity = newCapacity;
		numberOfDoors = newDoors;
	}
	


	/**
	 * @return the cargoCapacity
	 */
	public double getCargoCapacity() {
		return cargoCapacity;
	}

	/**
	 * @param cargoCapacity the cargoCapacity to set
	 */
	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	@Override
	public String toString()
	{
		return "Truck [horsepower=" + super.getHorsepower()  + ", numberOfWheels= " + super.getNumberOfWheels()
				+  " cargoCapacity= " + cargoCapacity + " sq feet" + " numberOfDoors= " + numberOfDoors + "]";
	}
	
}