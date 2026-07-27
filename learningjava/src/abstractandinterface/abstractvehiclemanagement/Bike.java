package abstractandinterface.abstractvehiclemanagement;

public class Bike extends Vehicle {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike started");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bike stopped");
	}

	@Override
	void fuleType(String fule) {
		// TODO Auto-generated method stub
		if(fule.equalsIgnoreCase("Electric")) {
			System.out.println("from bike class- An electric scooter does not use liquid fuel");
		}else {
			System.out.println("from bike class-fule type is "+fule);
		}
	}

}
