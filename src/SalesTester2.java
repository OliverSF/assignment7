
import java.util.Scanner;
import java.util.*;

public class SalesTester2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<SalesEmployee2> Employees = new ArrayList<SalesEmployee2>();
		
		//hardcoded....?switch and decide whether SalesAgent/Person
		//also input to Add first+last Name and PPS no.
		//Employees.add(new SalesAgent("Bob", "Archer", "ppsno"));
		
		int choice = 0;
		
		int counter = -1;
		
		//??if this needs to be inside while loop? ...probably
		
		
		while (choice !=3){
				
			System.out.println("Enter 1 if you are a Sales Agent; Enter 2 if you are a Sales Person; Enter 3 to exit the program");
			
			choice = input.nextInt();
			
			if(choice !=3){
				counter++;
			
			if(choice == 1){
				
				input.nextLine();
				Employees.add(new SalesAgent2());
				System.out.println("Please Enter your First Name: ");
				
				//how to write for loop here with counter to get the correct
				//index in each if statement??
				Employees.get(counter).setFirstName(input.nextLine());
				
				System.out.println("Please Enter your Last Name: ");
				Employees.get(counter).setLastName(input.nextLine());
				
				System.out.println("Please Enter your PPS Number: ");
				Employees.get(counter).setPPS(input.nextLine());
				
				System.out.println("Please Enter your sales figures: ");
				Employees.get(counter).sales = input.nextDouble();
				
				//ArrayList<Integer> bikesales = new ArrayList<Integer>();
				
				//for(int counter1=0; counter<bikesales.size(); counter++ ){
					//bikesales.get(counter1).set
				//}
			}
		
			else if (choice == 2){
				
				input.nextLine();
				Employees.add(new SalesPerson2());
				
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
		System.out.println("\nSales Review: \n ");
		
		for(SalesEmployee2 p : Employees){
			
			p.calculateCommission();
			//p.getClass();
			System.out.print("Employee: " + p.getEmployeeNumber() + " - ");
			System.out.println(p.getClass() + p.toString());
		}
	}

}
