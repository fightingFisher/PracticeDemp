package Thread;

public class Test {
	public static void main(String[] args) throws Exception {
		Test test = new Test();
		threadtest a = new threadtest("子线程1");
		threadtest b = new threadtest("子线程2");
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}
