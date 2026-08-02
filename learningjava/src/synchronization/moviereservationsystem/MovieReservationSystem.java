package synchronization.moviereservationsystem;

import java.util.concurrent.locks.ReentrantLock;

public class MovieReservationSystem  {
	int avaiableSeats;
	ReentrantLock lock;
	//int numSeats;
	
	public MovieReservationSystem(int avaiableSeats, ReentrantLock lock) {
		//super();
		this.avaiableSeats = avaiableSeats;
		this.lock = lock;
	}
	
	public boolean reserveSeats(int numSeats) {
		lock.lock();
		if(avaiableSeats>=numSeats) {
			
			avaiableSeats -= numSeats;
			lock.unlock();
			return true;
			
		}
		return false;
		
	}
	public int getAvailableSeats() {
		return avaiableSeats;
	}

	

}
