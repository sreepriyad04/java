package threadandconcurrency.processvsthread;

import java.util.Date;

public class Client  {
	public static void main(String args[]) throws InterruptedException {

		Worker w1= new Worker("download");
		Worker w2= new Worker("compress");
		Worker w3= new Worker("upload");
		
		System.out.println("sequential run");
		long startTime=System.currentTimeMillis();
		
		w1.run();
		w2.run();
		w3.run();
		
		long endTime=System.currentTimeMillis();
		 System.out.println("Sequence total time is "+(startTime-endTime)+" ms");
		 
		 System.out.println("Concurrent run start");
			long concurrentSartTime=System.currentTimeMillis();
			
		Thread t1 = new Thread(new Worker("download"));
		Thread t2 = new Thread(new Worker("compress"));
		Thread t3 = new Thread(new Worker("upload"));
		t1.start();
		t2.start();
		t3.start();// till here threads were switching their tasks and results were not consistent to fix this we can use join()
		
		t1.join();
		t2.join();
		t3.join();
		
		long concurrentEndTime=System.currentTimeMillis();
		 System.out.println("Concurrent total time is "+(concurrentSartTime-concurrentEndTime)+" ms");
		
		
	}

}
