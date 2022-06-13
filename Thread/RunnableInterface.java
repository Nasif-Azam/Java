package Thread;

public class RunnableInterface implements Runnable {

	public void run() { // Runnable
		System.out.println("Theard is Running..");
	}

	public static void main(String[] args) {
		RunnableInterface RI = new RunnableInterface();
		Thread T = new Thread(RI); // Create Thread or New Thread
		T.start(); // Running Thread
	}

}
