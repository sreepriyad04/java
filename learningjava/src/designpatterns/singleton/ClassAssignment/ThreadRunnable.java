package designpatterns.singleton.ClassAssignment;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable class"+Thread.currentThread().getName());
		Database.createInstance();
		
	}

}
