
/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
import java.text.DecimalFormat;

//creating abstract class SalesEmployee
public abstract class SalesEmployee {

	// creating variables
	private String firstName;
	private String lastName;
	private static int bikeEmployeeNumber;
	private String ppsNumber;
	protected double sales;
	protected double commission;
	private int employeeNumber = 0;

	// creating default constructor
	public SalesEmployee() {
		firstName = "";
		lastName = "";
		ppsNumber = "";
		sales = 0;
		commission = 0;
		employeeNumber = ++bikeEmployeeNumber;
	}

	// creating constructor
	public SalesEmployee(String firstName, String lastName, String ppsNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.ppsNumber = ppsNumber;
		this.employeeNumber = ++bikeEmployeeNumber;
	}

	// Creating setter for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Creating setter for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Creating setter for ppsNumber
	public void setPPS(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}

	// Creating getter for firstName
	public String getFirstName() {
		return firstName;
	}

	// Creating getter for lastName
	public String getLastName() {
		return lastName;
	}

	// Creating getter for ppsNumber
	public String getPPS() {
		return ppsNumber;
	}

	// Creating getter for EmployeeNumber
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	// Overriding toString Method
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		// Using the Decimal formatter to format sales & commission output
		return "\nName: " + getFirstName() + " " + getLastName() + "\nPPS No: " + getPPS() + "\nTotal Sales: "
				+ df.format(sales) + "\nCommission Paid: " + df.format(commission) + "\n";
	}

	// Creating abstract calculateCommission method
	public abstract void calculateCommission();

} // End Class
