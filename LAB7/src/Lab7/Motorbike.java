package Lab7;

public class Motorbike extends Vehicle {

	
	public void Move() {
		System.out.println ("Motorbike Move");
	}//end method
	
	public void Move(String Name ,int x) {
		System.out.println("The Motorbike drove by "+ Name +" and MotorBike have "+ x +" wheels");
	}//end method
	
}
