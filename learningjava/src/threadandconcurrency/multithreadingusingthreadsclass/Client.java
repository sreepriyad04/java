package threadandconcurrency.multithreadingusingthreadsclass;

public class Client extends Thread{
	public void run() {
		System.out.println("Iam the main class = "+Thread.currentThread().getName());
	}
	 public static void main(String args[]) {
		 
		 Thread c = new Client();
		 c.run();
		 Thread a= new Adder();
		 Thread s = new Subtractor();
		 a.run();
		 s.run();  // run method to execute in sequential, start() to run concurrent
		 System.out.println("\nafter run()\n");
		 c.start();
		 a.start();
		 s.start();
		 
	 }

}
