import java.text.DecimalFormat;

public abstract class SalesEmployee2 {
	
	//creating variables
	private String firstName;
	private String lastName;
	private static int bikeEmployeeNumber = 1;
	private String ppsNumber;
	protected double sales;
	protected double commission;
	private int employeeNumber;
	
	//creating default constructor
	public SalesEmployee2(){
		firstName = "";
		lastName = "";
		ppsNumber = "";
		sales = 0;
		commission = 0;
		employeeNumber = bikeEmployeeNumber++;
	}
	
	//creating constructor
	public SalesEmployee2(String firstName, String lastName, String ppsNumber){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ppsNumber = ppsNumber;
		this.employeeNumber = bikeEmployeeNumber++;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setPPS(String ppsNumber){
		this.ppsNumber = ppsNumber;
	}

	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getPPS(){
		return ppsNumber;
	}
	
	public int getEmployeeNumber(){
		return employeeNumber;
	}
	
	public String toString(){
		DecimalFormat df = new DecimalFormat("0.00");
		return "\nName: " + getFirstName() + " " + getLastName() + "\nPPS No: " + getPPS() + "\nTotal Sales: "+ df.format(sales) + "\nCommission Paid: " + df.format(commission) + "\n";
	}
	
	public abstract void calculateCommission();
		

} //End Class
