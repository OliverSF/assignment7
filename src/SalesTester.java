
/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */

import java.util.Scanner; //selecting and bringing in the scanner utility
import java.util.*; //importing all lists using *

public class SalesTester {

	public static void main(String[] args) {

		// declaring and creating new instance of the scanner
		Scanner input = new Scanner(System.in);

		// Creating Arraylist to hold collection of SalesEmployee objects
		List<SalesEmployee> Employees = new ArrayList<SalesEmployee>();

		// Creating int variable 'choice' for while loop
		int choice = 0;

		// Creating & initialising int variable 'counter'
		int counter = -1;

		// Creating while loop
		while (choice != 3) {

			// Output to show user how to use the program
			System.out.println(
					"Enter 1 if you are a Sales Agent; Enter 2 if you are a Sales Person; Enter 3 to exit the program");

			// assigning choice to int entered by user
			choice = input.nextInt();

			// incrementing choice is user doesn't enter 3
			if (choice != 3) {
				counter++;

				// Creating if statement if user enters 1 for Sales agent
				if (choice == 1) {

					input.nextLine(); // to clear the input
					Employees.add(new SalesAgent()); 
					// adding new Sales Agent to 'Employees' ArrayList

					// Output to user to enter their First Name
					System.out.println("Please Enter your First Name: ");
					Employees.get(counter).setFirstName(input.nextLine()); 
					// Setting user first name

					// Output to user to enter their Last name
					System.out.println("Please Enter your Last Name: ");
					Employees.get(counter).setLastName(input.nextLine()); 
					// Setting users last name

					// Output to user to enter their PPS
					System.out.println("Please Enter your PPS Number: ");
					Employees.get(counter).setPPS(input.nextLine()); 
					// Setting users PPS

					// Output to user to enter their sales
					System.out.println("Please Enter your sales figures: ");
					Employees.get(counter).sales = input.nextDouble(); 
					// Setting users sales

				}

				// Creating if statement if user enters 2 for Sales Person
				else if (choice == 2) {

					input.nextLine(); // to clear the input
					Employees.add(new SalesPerson()); 
					// adding new Sales Person to 'Employees ArrayList

					System.out.println("Please Enter your First Name: ");
					Employees.get(counter).setFirstName(input.nextLine());

					System.out.println("Please Enter your Last Name: ");
					Employees.get(counter).setLastName(input.nextLine());

					System.out.println("Please Enter your PPS Number: ");
					Employees.get(counter).setPPS(input.nextLine());

					System.out.println("Please Enter your sales figures: ");
					Employees.get(counter).sales = input.nextDouble();

				}

			}
		}
		// Heading for Output
		System.out.println("\nSales Review: \n");

		// Using enhanced for loop to traverse the ArrayList
		for (SalesEmployee p : Employees) {

			// calling the calculateCommission method
			p.calculateCommission();
			// Output to console
			System.out.print("Employee: " + p.getEmployeeNumber());
			// Output to console calling the getClass method and toString
			System.out.println(p.toString());
		}

		input.close(); // Close input to avoid possible leak

	} // End main method

} // End Class
