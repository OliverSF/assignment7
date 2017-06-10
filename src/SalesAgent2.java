
public class SalesAgent2 extends SalesEmployee2{
	
	public SalesAgent2(){
		super ();
	}

	public SalesAgent2(String firstName, String lastName, String ppsNumber){
		super();
	}

	public void calculateCommission(){
		//commission = 0;
		//int sum = 0;
		//double commission is already created in parent class
		//sum = bike sale 1 + bike sale 2 +++++
		//commission = sum*(0.1)
		//?will this set the commission field as it is only protected and not private
		commission = sales*0.1;
	}
}
