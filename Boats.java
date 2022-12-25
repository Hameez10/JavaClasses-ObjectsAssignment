/**
 * This is a class for boats. This class extends the vehicles class
 * 
 * @author Muhammad Hameez Iqbal, Shardul Bhardwaj, Brandon Nguyen
 * @since jdk 14.02
 * @version ide 4.16
 *
 */
public class Boats extends Vehicle{
	
	//Variables
	private String boatName;
	private boolean boat = false;

	/**
	 * This is the constructor function for new boats
	 * 
	 * @param typeOfVehicle - Type of vehicle
	 * @param costOfVehicle - The price of the vehicle
	 * @param changeOil - Boolean. Asking if oil is change(true of false).
	 * @param turnOn - Boolean. Is the car on?(true or false)
	 * @param boatName - Collects the boat's name as a string
	 */
	Boats(String typeOfVehicle, String costOfVehicle, boolean changeOil, boolean turnOn, String boatName) {
		super(typeOfVehicle, costOfVehicle, changeOil, turnOn);
		this.boatName = boatName;
	}
	/**
	 * This method makes the boolean boat to true. It then prints the status of boolean
	 * 
	 * @returns in a statement that this method was called
	 */
	public String dock() {
		boat = true;
		System.out.println("Is the boat docked?: "+boat);
		return "Boat's docking status prompted";
	}
	/**
	 * This method tells the user the boats name in a print statement
	 * 
	 * @returns that this method was called.
	 */
	public String boatName() {
		System.out.println("The boats name is "+ boatName);
		return "Boat name prompted.";
	}
}
