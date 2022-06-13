package Thread;

public class AllPriority extends Thread {
	public void run() {
		System.out.println("Running..." + Thread.currentThread().getName());
		System.out.println("Running..." + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		AllPriority T1 = new AllPriority();
		AllPriority T2 = new AllPriority();
		AllPriority T3 = new AllPriority();
		AllPriority T4 = new AllPriority();
		AllPriority T5 = new AllPriority();
		System.out.println(T1.getPriority() + " " + T2.getPriority() + " " + T3.getPriority() + " " + T4.getPriority()
				+ " " + T5.getPriority());
		T1.setPriority(MAX_PRIORITY);
		T2.setPriority(NORM_PRIORITY);
		T3.setPriority(MIN_PRIORITY);
		T4.setPriority(2);
		T5.setPriority(9);
		System.out.println(T1.getPriority() + " " + T2.getPriority() + " " + T3.getPriority() + " " + T4.getPriority()
				+ " " + T5.getPriority());
		T1.start();
		T2.start();
		T3.start();
		T4.start();
		T5.start();

	}

}
