/**
 * This is a class for planes. This class extends the vehicles class
 *  
 * @author Muhammad Hameez Iqbal, Shardul Bhardwaj, Brandon Nguyen
 * @since jdk 14.02
 * @version ide 4.16
 *
 */
public class Planes extends Vehicle{
	public int maxCapacity;
	boolean flight; 
	
	/**
	 * This is a constructor function for new planes
	 * 
	 * @param typeOfVehicle - Type of vehicle
	 * @param costOfVehicle - The price of the vehicle
	 * @param changeOil - Boolean. Asking if oil is change(true of false).
	 * @param turnOn - Boolean. Is the car on?(true or false)
	 * @param maxCapacity - Max capacity of plane
	 * @param flight - Boolean. Is it in the air?(true or false)
	 */
	public Planes(String typeOfVehicle, String costOfVehicle, boolean changeOil, boolean turnOn, int maxCapacity, boolean flight) {
		super(typeOfVehicle, costOfVehicle, changeOil, turnOn);
		this.maxCapacity = maxCapacity;
		this.flight = flight;
	}
	/**
	 * This method will change the boolean flight into true. It will print a statement telling it is flying
	 * 
	 * @returns the statement "Fly method used"
	 */
	public String fly() {
		flight = true;
		System.out.println("Plane is now flying");
		return "Fly method used";
	}

}
