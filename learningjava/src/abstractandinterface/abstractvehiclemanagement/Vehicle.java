package abstractandinterface.abstractvehiclemanagement;

public abstract class Vehicle {
	String registrationNum;
	String brand;
	
	abstract void start();
	abstract void stop();
	abstract void fuleType(String fule);
	
	void displayDetails() {
		System.out.println("Car brand is "+brand);
		System.out.println("car registration num is "+registrationNum);
	}
	

}
