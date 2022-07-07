
class MyRunnable implements Runnable {
	String myName;
	public MyRunnable(String name) { myName = name; }
	public void run() {
		for(int i=5; i>=0; i--) System.out.print(myName+i+" ");
	}
}

public class TestThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable("A"));
		Thread t2 = new Thread(new MyRunnable("B"));
		Thread t3 = new Thread(new MyRunnable("C"));
		t1.start();
		t2.start();
		t3.start();
	}
}
