package Thread;

import javax.sql.rowset.spi.SyncFactory;

public class threadtest implements Runnable {
	private String name;
	private int count = 5;

	public threadtest(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; ++i) {
			if (count > 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(count--);
			}
		}
	}
}
