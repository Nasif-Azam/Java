package Thread;

public class SleepMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		SleepMethod T1 = new SleepMethod();
		SleepMethod T2 = new SleepMethod();

		T1.start();
		T2.start();
	}

}
