package synchronization.Trainreservationsystem;

import java.util.concurrent.locks.ReentrantLock;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		
		
		TrainReservationSystem ts = new TrainReservationSystem();
		
		//Instead of using anonymous class we can create using lambda functions.
		
		Thread t1= new Thread() {
			public void run() {
				
				System.out.println("t1 thread "+ ts.reserveSeats("Ac", 10));
			}
		};
		t1.start();
		t1.join();
		
		Thread t2= new Thread() {
			public void run() {
				System.out.println("t2 thread "+ ts.reserveSeats("Sc", 60));
			}
		};
		t2.start();
		t2.join();
		
		System.out.println("Avaiable number of seats are "+ts.getAvailableSeats("Ac"));
		System.out.println("Avaiable number of seats are "+ts.getAvailableSeats("Sc"));
	}

}
