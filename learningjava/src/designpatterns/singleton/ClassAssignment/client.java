package designpatterns.singleton.ClassAssignment;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {
	public static void main(String[] args) throws Exception {
		
//		Database db1 = new Database();
//		Database db2 = new Database();
//		
//		System.out.println(" "+db1.hashCode()+" "+db2.hashCode());
		// created multiple objects
		// to create only single object next we make public constructor as private constructor
		
		// we cannot create objects for private constructors, to fix this we will use  method to create object inside the same class
		// call static method using class reference
		
		
		System.out.println(Database.createInstance().hashCode());
		System.out.println(Database.createInstance().hashCode());// it still creates two onjects, to fix this we will add null check
		
		System.out.println(Database.createInstance1().hashCode());
		System.out.println(Database.createInstance1().hashCode());// now createInstance1 created two objects with refers to same address
		
		//using multiple threads
		
		ThreadRunnable tr1=new ThreadRunnable();
		Thread t1=new Thread(tr1);
		t1.start();
		ThreadRunnable tr2=new ThreadRunnable();
		Thread t2=new Thread(tr2);
		t2.start();
		
		System.out.println("threads1 " +tr1.hashCode());
		System.out.println("Threads2= "+tr2.hashCode());
		
//		Callable ThreadClassobj =(Callable) new ThreadCallable();
//		Object callableOut= ThreadClassobj.call();
//		
//		
//		System.out.println(callableOut.hashCode());  // this is normal main thread
		//this is for multiple threads for callable 
		ExecutorService service =
		        Executors.newFixedThreadPool(3);

		Future<Object> futureThread1 =
		        service.submit(new ThreadCallable());
		Future<Object> futureThread2 =
		        service.submit(new ThreadCallable());
		Future<Object> futureThread3 =
		        service.submit(new ThreadCallable());
		

		Object instance1 = futureThread1.get();
		Object instance2 = futureThread2.get();
		Object instance3 = futureThread3.get();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
		service.shutdown();
		

		
		
		
		
	}

}
