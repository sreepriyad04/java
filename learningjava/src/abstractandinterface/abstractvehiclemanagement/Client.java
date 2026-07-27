package abstractandinterface.abstractvehiclemanagement;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v= new Car();
		Vehicle c= new Car();
		Vehicle e= new ElectricScooter();
		
		v.brand="Merc";
		v.registrationNum="M123";
		v.displayDetails();
		v.fuleType("electric");
		v.fuleType("Petrol");
		c.start();
		e.stop();
		
	}

}
