// Using anonymous class to implement multithreading
public class App3 {
	public static void main (String [] args) {
		Thread thread = new Thread(new Runnable() {
			
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
		});
		thread.start();
	}
}
