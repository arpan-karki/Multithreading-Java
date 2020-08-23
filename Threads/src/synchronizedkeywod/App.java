package synchronizedkeywod;

public class App {

	private int count = 0;

	/*
	 * Every Object has an intrinsic lock . Only One thread can acquire intrinsic
	 * lock at a time. Guaranteed that all threads can see the current state of the
	 * variable
	 */
	public synchronized void increment() {
		count++;

	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app1 = new App();
		app1.doWork();
	}

}
