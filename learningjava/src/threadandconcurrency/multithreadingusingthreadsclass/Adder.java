package threadandconcurrency.multithreadingusingthreadsclass;

public class Adder extends Thread {
	@Override
	public void run() {
		System.out.println("I am the Adder class = "+Thread.currentThread().getName());
	}

}
