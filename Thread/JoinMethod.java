package Thread;

public class JoinMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		JoinMethod T1 = new JoinMethod();
		JoinMethod T2 = new JoinMethod();
		JoinMethod T3 = new JoinMethod();
		T1.start();
		try {
			System.out.println("Current Thread Name : " + Thread.currentThread().getName());
			T1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Before Start Is T2 Running? : " + T2.isAlive());
		T2.start();
		System.out.println("After Start Is T2 Running? : " + T2.isAlive());
		T3.start();
	}
}
