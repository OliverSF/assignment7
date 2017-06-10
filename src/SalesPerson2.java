
public class SalesPerson2 extends SalesEmployee2{

	
	public SalesPerson2(){
		super ();
	}

	public SalesPerson2(String firstName, String lastName, String ppsNumber){
		super();
	}

	public void calculateCommission(){
		//commission = 0;
		commission = sales*0.15;
	}
}
