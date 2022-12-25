/**
 * This is in an interface class that has the method kmPerHour, numOfWheels, numOfSeats, renewLicensePlate
 *  
 * @author Muhammad Hameez Iqbal, Shardul Bhardwaj, Brandon Nguyen
 * @since jdk 14.02
 * @version ide 4.16
 *
 */

public interface roadVehicles {
	/**
	 * This method is to print the vehicles max speed
	 */
	public String kmPerHour();
	/**
	 * This method is to print the vehicles number of wheels
	 */
	public String numOfWheels();
	/**
	 * This method is to print the vehicles number of seats
	 */
	public String numOfSeats();
	/**
	 *This method is to print a statement saying license plate has been renewed
	 */
	public String renewLicensePlate();
}
