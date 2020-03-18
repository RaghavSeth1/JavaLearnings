package interfaceDemo;

public class AdvancedCalc implements BasicCalc {

	public static void main(String[] args) {
		
		x=90;
		
		//BasicCalc bc=new AdvancedCalc();		  //Base class methods only
		
		AdvancedCalc bc=new AdvancedCalc();      //All Methods
		//BasicCalc bc=new BasicCalc()     //Error - Can not create object of interface
		//AdvancedCalc bc=new BasicCalc();    //Error - Can not create object of interface as it has abstract methods(no body)
		bc.add();
		bc.sub();
		bc.calculateCosTheta();
		bc.calculateSinTheta();
		
		
	}

	@Override
	public void add() {		
		System.out.println("Inside Add method class");
	}

	@Override
	public void sub() {
		System.out.println("Inside Sub method class");
		
		
	}
	public void calculateSinTheta() {
		System.out.println("Inside sintheta method class");
		
	}
	public void calculateCosTheta() {
		System.out.println("Inside costheta method class");
		
	}
	
	

}
