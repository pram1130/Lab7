package Lab7 ;

public class Main {
	
	public static void main(String[] args) {
		Vehicle V = new Vehicle() ;

		int x = V.Wheel ;
		float y = (float) 456.4;
		
		V.Move();
		V.Move("User");
		
		Car 	C = new Car();
		C.Move();
		C.Move(x, y);
		
		Motorbike M = new Motorbike();
		M.Move();
		M.Move("pram", x - 2);

		Balloon B = new Balloon();
		B.Move();

		SuperCar S = new SuperCar();
		S.Move();
		
		Drone D = new Drone();
		D.Move();
		
	}



}