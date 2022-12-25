// Import statements
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 * This is the parent class for all of classes
 * 
 * @author Muhammad Hameez Iqbal, Shardul Bhardwaj, Brandon Nguyen
 * @since jdk 14.02
 * @version ide 4.16
 */

public class Vehicle {
	//Variables
	//Type	Name(=	Information)
	public String typeOfVehicles;
	public int costOfVehicle;
	boolean changeOil;
	boolean turnOn;
	int kmPerHour;
	
	/**
	 * This is the constructor function for new vehicles
	 * 
	 * @param typeOfVehicle - Type of vehicle
	 * @param costOfVehicle - The price of the vehicle
	 * @param changeOil - Boolean. Asking if oil is change(true of false).
	 * @param turnOn - Boolean. Is the car on?(true or false)
	 */
	Vehicle(String typeOfVehicle, String costOfVehicle, boolean changeOil, boolean turnOn){
		this.typeOfVehicles = typeOfVehicle;
		this.costOfVehicle = Integer.parseInt(costOfVehicle);//data type conversion
		this.changeOil = changeOil;
		this.turnOn = turnOn;
	}
	
	//Methods
	/**
	 * This method makes the boolean changeOil to true 
	 * 
	 * @returns the statement "Oil changed"
	 */
	public String changeOil() {
		System.out.println("Oil Changed.");
		this.changeOil = true;
		return "Oil Changed.";
	}
	/**
	 * This method makes the boolean turnOn to true
	 * 
	 * @returns the statement "Vehicle on."
	 */
	public String turnOn() {
		System.out.println("Vehicle on.");
		this.turnOn = true;
		return "Vehicle on.";
	}
	/**
	 * This method prints the type of vehicle the vehicle created is
	 * 
	 * @returns vehicle type as a string
	 */
	public String typeOfVehicle() {
		System.out.println(typeOfVehicles);
		return typeOfVehicles;
	}
	/**
	 * This method returns the cost of the vehicle
	 * 
	 * @returns cost of vehicle as an int
	 */
	public int cost() {
		System.out.println("This "+typeOfVehicles +" costs "+ String.valueOf(costOfVehicle));// We could have also used .parseInt
		return cost();
	}
}
	
