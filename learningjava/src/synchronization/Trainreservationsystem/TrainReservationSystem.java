package synchronization.Trainreservationsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class TrainReservationSystem  {
	//int avaiableSeats;
	ReentrantLock lock;
	Map<String,Integer>avaiableSeats;
	Map<String,ReentrantLock>seatTypeLock;
	
//	public TrainReservationSystem(ReentrantLock lock, Map<String, Integer> avaiableSeats,
//			Map<String, Integer> seatType) {
//		super();
//		this.lock = lock;
//		this.avaiableSeats = avaiableSeats;
//		this.seatType = seatType;
//	}

	
	public TrainReservationSystem() {
		//super();
		avaiableSeats = new HashMap<String, Integer>();
		seatTypeLock = new HashMap<String, ReentrantLock>();
		
		avaiableSeats.put("Ac",100);
		avaiableSeats.put("Sc", 50);
		
		seatTypeLock.put("Ac", new ReentrantLock());
		seatTypeLock.put("Sc", new ReentrantLock());
		
		
	}


	public boolean reserveSeats(String seatType, int numSeats) {
		ReentrantLock lock=seatTypeLock.get(seatType);
		lock.lock();
		int seatsCount= avaiableSeats.get(seatType);
		if(seatsCount >= numSeats) {
			
			//avaiableSeats.remove(avaiableSeats.size()-numSeats);
		avaiableSeats.put(seatType, seatsCount-numSeats);
			lock.unlock();
			return true;
			
		}
		return false;
		
	}
	public int getAvailableSeats(String seatType) {
		return avaiableSeats.get(seatType);

	}

	

}
