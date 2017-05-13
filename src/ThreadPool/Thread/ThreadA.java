package ThreadPool.Thread;

import java.util.Date;

public class ThreadA implements Runnable {

	int num = 0;

	public ThreadA(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println(new Date() + "线程：" + num + "静止3秒钟");
		try {
			Thread.sleep(3 * 10000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
