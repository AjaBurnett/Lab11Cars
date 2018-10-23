package CarLot;
import java.util.Arrays;
import java.util.Scanner;


public class CarApp {
	
	
	
	 	public static void main(String[] args) {
	 		String answer;
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the Grand Circus Motors admin console!");
						
						int x;
						String answer1 = null;
do 				{
				System.out.println("How many cars are you entering?");
			
				x = scan.nextInt();
	
				Car[] carArr = new Car[x];
			
				for (int i = 0; i < carArr.length; i++) {
				System.out.println("Vehicle" + " " +( i+1) + " make");
				String make = scan.nextLine();
				System.out.println("Vehicle" + " " +( i+1) + "  model: ");
				String model = scan.nextLine();
				System.out.println("Vehicle" + " " +( i+1) + "  Year: ");
				int year = scan.nextInt();
				scan.nextLine();
				System.out.println("Vehicle" + " " +( i+1) + "  Price: ");
				Double price = scan.nextDouble();
				carArr[i] = new Car(make, model, year, price);
				scan.nextLine();
			}
			
			System.out.println("Current Inventory:");
			System.out.println("");
		
			for (int i = 0; i < carArr.length; i++) {
			System.out.println(carArr[i]);
	
			System.out.println("Do you want to continue? (y/n)");
			answer1 = scan.next();
			scan.close();
	 	}
	 }while (answer1.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
}
}

