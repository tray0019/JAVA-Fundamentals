package JavaAdvance;

public class ThreadMain extends Thread {

	public static int amount = 0;
	
	public static void main(String[] args) {
		
		ThreadMain thread = new ThreadMain();
		thread.start();
		System.out.println("This code is outside of the thread: "+amount);
		amount++;
		System.out.println("Second: "+ amount );
	}
	
	public void run() {
		try {
			Thread.sleep(10); // Slow it down a little
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		amount++;
		System.out.println("This code is running in a thread");
	}

	
	
	/*
	 * Threads runs at random means theres
	 * is no way to know which order run
	 */

}
