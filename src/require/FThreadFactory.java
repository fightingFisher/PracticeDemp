package require;

import Thread.threadtest;

public class FThreadFactory {

	static final logicCode logicCode = new logicCode();

	public Thread creaThread(int i) {
		return new Thread() {
			@Override
			public void run() {
				int a = i;
				try {
					Thread.sleep(a * 1000);
					System.out.println("暂停" + a + "秒,表示该线程完成需要" + a + "秒");
					while (!logicCode.getString(a).equals("i>10")) {
						System.out.println("线程"+i+"重试ing,需要1秒");
						a = a + 2;
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
				}
			}
		};
	}
}
