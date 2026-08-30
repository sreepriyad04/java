package designpatterns.singleton.ClassAssignment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Database {
	public static Database instance;
	static Lock lock;
	//	public Database() {
	//		super();
	//	}

	private Database() {
		super();
	}

	public static Database createInstance() {

		instance=new Database();
		return instance;
	}

	public static Database createInstance1() {
		 lock = new ReentrantLock();
		 try {
		 lock.lock();
		if(instance==null) {
			
			instance=new Database();
		}return instance;
		 }
		finally {
			lock.unlock();
		}
		 
	}
	
	
}
