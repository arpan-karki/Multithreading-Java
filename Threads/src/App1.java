/*Using Runnable Interface For Multithreading  */

class RunnerInterface implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++)
			System.out.println("Hello" + i);

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class App1 {
	public static void main(String[] args) {

		Thread thread1 = new Thread(new RunnerInterface());
		Thread thread2 = new Thread(new RunnerInterface());
		thread1.start();
		thread2.start();
		
	}

}
