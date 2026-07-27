package abstractandinterface.abstractvehiclemanagement;

public class Car extends Vehicle{

	//public String fuleType;  to use this variable create an object with car class reference
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("car stopped");
		
	}

	@Override
	void fuleType(String fule) {
		// TODO Auto-generated method stub
		if(fule.equalsIgnoreCase("Electric")) {
			System.out.println("from Car class-An electric scooter does not use liquid fuel");
		}else {
			System.out.println("From car class-fule type is "+fule);
		}
		
	}
	

}
