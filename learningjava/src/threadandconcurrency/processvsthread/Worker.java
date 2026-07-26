package threadandconcurrency.processvsthread;

import java.util.Date;

public class Worker implements Runnable{
	
	String order;
	
	Worker(String order){
		this.order=order;
		
	}
	@Override
	public void run(){
		PerformTask(order);
	}
	
	
	
	public void PerformTask(String order) {
		
		// TODO Auto-generated method stub
		System.out.println(order+" file started  "+Thread.currentThread().getName());
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println(order+ " file completed  "+Thread.currentThread().getName());
//		System.out.println(order+"Compress file started");
//		
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		System.out.println(order+"Compress file completed");
//		System.out.println(order+"Upload file started");
//		
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
//		System.out.println(order+"Compress file completed");
		
	}
	

}
