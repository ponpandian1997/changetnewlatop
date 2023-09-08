package week2.day1;

public class Car {
	
	public void drivecar() {
		System.out.println("drivecar");
	}
	protected  void punture() {
		System.out.println("yes car is punture");
	}
	public void soundhorn () {
		System.out.println("soundhorn");
		}
	public void brake() {
		System.out.println("applybrake");
				}
	public static void main(String[] args) {
		Car obj = new Car();
		
		obj.brake();
		obj.drivecar();
		obj.punture();
		obj.soundhorn();
		
		
	}

}
