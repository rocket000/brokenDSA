package broken.java;

public class ThreadsBasics {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadAB b = new ThreadAB();
		System.out.println(Runtime.version());
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();

	}

}

class ThreadA implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(100L);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadAB implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Bye");
			try {
				Thread.sleep(100L);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
