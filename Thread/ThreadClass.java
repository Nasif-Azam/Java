package Thread;

public class ThreadClass extends Thread {
	public void run() { // Runnable
		System.out.println("Theard is Running..");
	}

	public static void main(String[] args) {
		ThreadClass T = new ThreadClass(); // Create Thread or New Thread
		T.start(); // Running Thread
	}
}
