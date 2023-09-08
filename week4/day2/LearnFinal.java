package week4.day2;
  //cannot inherit
public class LearnFinal {
	
	static final int cvv = 123;
	   
	static  String name="Qeagle";
    
    public void modelCar() {
    	System.out.println("swift");
    }
    //we can not override
    public final void design() {
    	System.out.println("design of the car");
    }

	public static void main(String[] args) {
		System.out.println(cvv);
		
				//String immutable final can not the change the value
				name.concat("Testleaf");
				
				System.out.println(name);
				}

   }
