/**
 * This is a class for trucks. This class extends the vehicles class and implements methods from the interface roadVehicles
 *  
 * @author Muhammad Hameez Iqbal, Shardul Bhardwaj, Brandon Nguyen
 * @since jdk 14.02
 * @version ide 4.16
 *
 */
public class Trucks extends Vehicle implements roadVehicles{

	int kmPerHour;
	private int numOfSeats;
	int numOfWheels;
	String licensePlate;

	/**
	 * This is the constructor function for new trucks
	 * 
	 * @param typeOfVehicle - Type of vehicle
	 * @param costOfVehicle - The price of the vehicle
	 * @param changeOil - Boolean. Asking if oil is change(true of false).
	 * @param turnOn - Boolean. Is the car on?(true or false)
	 * @param licensePlate - License plate as a string
	 * @param numOfWheels - Number of wheels in a vehicle
	 * @param kmPerHour - max speed of car
	 * @param numOfSeats - Number of seats in the car
	 */
	Trucks(String typeOfVehicle, String costOfVehicle, boolean changeOil, boolean turnOn, String licensePlate, int numOfWheels, int kmPerHour, int numOfSeats) {
		super(typeOfVehicle, costOfVehicle, changeOil, turnOn);
		this.kmPerHour = kmPerHour;
		this.licensePlate = licensePlate;
		this.numOfWheels = numOfWheels;
		this.numOfSeats = numOfSeats;
	}

	/**
	 * This function tells the user the max speed of vehicle
	 * 
	 * @returns as a string "kmPerHour"
	 */
	@Override
	public String kmPerHour() {
		System.out.println("Km per hours is "+ kmPerHour);
		return "kmPerHour";
		
	}
	/**
	 * This function tells the user the number of wheels in the vehicle
	 * 
	 * @returns as a string "numOfWheels"
	 */
	@Override
	public String numOfWheels() {
		System.out.println("number of wheels in the truck are " + numOfWheels);
		return "numOfWheels";
	}
	/**
	 * This method tells the user the number of seats in the truck
	 * 
	 *  @returns as a string "numOfSeats"
	 */
	@Override
	public String numOfSeats() {
		System.out.println("Number of seats: " + numOfSeats);
		return "numOfSeats";
		
	}
	/**
	 * This method tells the user the license plate has been renewed and prints the plate in a statement
	 * 
	 * @returns as a string "renewLicensePlate"
	 */
	@Override
	public String renewLicensePlate() {
		System.out.println("License plate renewed. License plate is " + licensePlate);
		return "renewLicensePlate";
		
	}
	/**
	 * This method calls on the methods kmPerHour, numOfWheels, numOfSeats, renewLicensePlate, changeOil
	 * all in one function
	 * 
	 * @returns as a string a list of all the methods used
	 */
	public String allTrucks() {
		kmPerHour();
		numOfWheels();
		numOfSeats();
		renewLicensePlate();
		changeOil();
		return "Methods used for truck: kmPerHour, numOfWheels, numOfSeats, renewLicensePlate";
	}
}
