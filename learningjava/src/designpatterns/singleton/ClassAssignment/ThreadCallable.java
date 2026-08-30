package designpatterns.singleton.ClassAssignment;

import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<Object> {

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		Database db1=Database.createInstance();
//	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("callable class"+Thread.currentThread().getName());
		Database db1=Database.createInstance1();
		return db1;
	}
	
}
