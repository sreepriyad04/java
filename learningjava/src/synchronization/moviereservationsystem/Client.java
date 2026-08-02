package synchronization.moviereservationsystem;

import java.util.concurrent.locks.ReentrantLock;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		
		ReentrantLock lock=new ReentrantLock();
		MovieReservationSystem ms = new MovieReservationSystem(100,lock);
		
		//Instead of using anonymous class we can create using lambda functions.
		
		Thread t1= new Thread() {//this is class as anonymous inner class
		public void run() {
			System.out.println("from first thread "+getName()+" and resteved seat = "+ms.reserveSeats(5));
		}
		};
		t1.start();
		//ms.reserveSeats(5);
		Thread t2 = new Thread() {
			public void run() {
				ms.reserveSeats(10);
			}
		};
		//ms.reserveSeats(10);
		t2.start();
		t1.join();
		t2.join();
		
	System.out.println("Avaiable number of seats are "+ms.getAvailableSeats());
	}

}
