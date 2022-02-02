package Lab7;

public class Drone extends Balloon {
	Balloon B = new Balloon();
	int x ;
	
	public void Move() {
		x = B.Wheel ;
		System.out.println ("Drone Flying to sky!!!");
		
	}
}
