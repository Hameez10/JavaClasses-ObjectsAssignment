//Import statements
import java.io.*;
/**
 * This is the main class
 * 
 * This is where all the 
 *  
 * @author Muhammad Hameez Iqbal, Shardul Bhardwaj, Brandon Nguyen
 * @since jdk 14.02
 * @version ide 4.16
 *
 */
public class main {

	public static void main(String[] args) {
		
		
		try {
			//Inputs all return statements in txt file
			FileWriter out=new FileWriter("out.txt"); 
			BufferedWriter writeFile = new BufferedWriter(out);
			
			//Trucks example
			//Creates a vehicle with the Trucks class
			Trucks t1 = new Trucks("Truck", "1000", false, false, "BHOP 235", 12, 145, 2);
			System.out.println("Trucks");
			writeFile.write(t1.allTrucks());
			writeFile.newLine();
			System.out.println("\n\n\n");
			
			//Car example
			//Creates a vehicle with the cars class
//			//Only difference between car and truck is that car has 'fuel' method
			cars c1 = new cars("sportscar", "20000", false, false, "BLBR 301", 4, 260, 2, 37);
			System.out.println("Car 1");
			writeFile.write(c1.allCars());
			writeFile.newLine();
			System.out.println("\n");
			
			//Creates a vehicle with the cars class
//			//Second car example
			cars c2 = new cars("SUV", "30000", false, false, "ICS4U0", 4, 260, 5, 87);
			System.out.println("Car 2");
			writeFile.write(c2.allCars());
			writeFile.newLine();
			System.out.println("\n\n\n");
			
			//Plane Example
			//Creates a vehicle object with the planes class
			Planes p1 = new Planes("Cessna", "250000", false, false, 12, false);
			System.out.println("Plane");
			writeFile.write(p1.fly());
			writeFile.newLine();
			System.out.println("\n\n\n");

		
//			//Boat Example
			//Creates a vehicle with the boats class
			Boats b1 = new Boats("Speedboat", "350000", false, false, "Hickery");
			System.out.println("Boat");
			writeFile.write(b1.dock());
			writeFile.newLine();
			writeFile.write(b1.boatName());
			writeFile.newLine();
			System.out.println("\n\n\n");
			
			
			writeFile.close();
			out.close();
			
			//Confirmation statement
			System.out.println("Data written to file.");
			
			}catch (IOException e){
				System.out.println("Problem writing to file."); 
				System.err.println("IOException: " + e.getMessage());
			}
		

	
		//Read File
		String phrase;
		try {
			FileReader in = new FileReader("out.txt"); //create FileReader object
			BufferedReader readFile = new BufferedReader(in);
			
			//create BufferedReader object 'readfile' which buffers the data 
			while ((phrase = readFile.readLine()) != null) { //read new line
			System.out.println(phrase);
		}
		//close FileReader % Buffer Reader
         readFile.close();
         in.close();
		}catch (IOException e) { //this is the minimum catch syntax needed 
			System.out.println("Problem reading file."); 
			System.err.println("IOException: " + e.getMessage());
		}

	}


}
		

