/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */

//making SalesAgent a subclass of SalesEmployee(the superclass)
public class SalesAgent extends SalesEmployee{
	
	// creating default constructor
	public SalesAgent(){
		super (); // calling the super constructor
	}
	
	// creating constructor
	public SalesAgent(String firstName, String lastName, String ppsNumber){
		 // calling the super constructor
	}
	
	//Overriding the calculateCommission method for Sales Agent
	public void calculateCommission(){
		//setting the commission variable equal to 10% of sales
		commission = sales*0.1;
	}
} //End Class
