/**
 * 
 */

/**
 * Car child class extends vehicle
 * 
 * @author David Renard
 *
 */
public class Car extends Vehicle {
	
	// attributes 
	private String color;
	private int numberOfDoors;
	
	/**
	 * 
	 */
	public Car(double horsepower, int numberOfWheels, String newColor, int newDoors) 
	{
		
		super(horsepower, numberOfWheels);
		color = newColor;
		numberOfDoors = newDoors;
	}
	

	/**
	 * 
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


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		return "Car [horsepower=" + super.getHorsepower()  + ", numberOfWheels= " + super.getNumberOfWheels()
				+  " Color= " + color + " numberOfDoors= " + numberOfDoors + "]";
	}


}
