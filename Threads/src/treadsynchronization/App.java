package treadsynchronization;

import java.util.Scanner;

class Processor extends Thread {

	private volatile boolean running = true;/*Tells thread that this is a volatile variable i.ee, its vaule may change*/ 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (running) {

			System.out.println("Hello");

			try {
				Thread.sleep(100);
				
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public void shutdown() {
		running=false;
	}
	
}

public class App {

	public static void main(String[] args) {
		Processor processor1 = new Processor();
		processor1.start();
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		processor1.shutdown();
		
		
		

	}
}
