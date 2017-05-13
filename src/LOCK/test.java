package LOCK;

public class test {

	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			System.out.println("i=" + i + " -------  ");
			creatThread("thread" + i).start();
		}
	}

	public static Thread creatThread(String name) {
		final Demo demo = new Demo();
		return new Thread(name) {
			@Override
			public void run() {
				System.out.println(demo.getName(this));
			}
		};
	}
}
