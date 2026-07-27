package abstractandinterface.abstractvehiclemanagement;

public class ElectricScooter extends Vehicle {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Electric scooter started");
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Electric scooter stopped");
		
	}

	@Override
	void fuleType(String fule) {
		// TODO Auto-generated method stub
		if(fule.equalsIgnoreCase("Electric")) {
			System.out.println("from ElectricScooter class- An electric scooter does not use liquid fuel");
		}else {
			System.out.println("from ElectricScooter class fule type is "+fule);
		}
	}

}
