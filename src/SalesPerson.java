/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */

//making SalesPerson a subclass of SalesEmployee(the superclass)
public class SalesPerson extends SalesEmployee {

	// creating default constructor
	public SalesPerson() {
		super(); // calling the super constructor
	}

	// creating constructor
	public SalesPerson(String firstName, String lastName, String ppsNumber) {
		super(); // calling the super constructor
	}

	// Overriding the calculateCommission method for Sales Person
	public void calculateCommission() {
		// setting the commission variable equal to 15% of sales
		commission = sales * 0.15;
	}
} // End Class
