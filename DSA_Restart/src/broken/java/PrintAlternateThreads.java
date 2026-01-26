package broken.java;

public class PrintAlternateThreads {

	public static void main(String[] args) throws InterruptedException {
		PrinterTask printer = new PrinterTask();
		Thread t1 = new Thread(printer);
		t1.setName("Worker-1");
		Thread t2 = new Thread(printer);
		t2.setName("Worker-2");
		t1.start();
		t2.start();
		t1.join();
		t2.join();


	}

}

class PrinterTask implements Runnable {

	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + ": Running task" + i);
		}
	}
}