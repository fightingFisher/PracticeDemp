package LOCK;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {

	private Lock lock = new ReentrantLock();// 锁对象

	public String getName(Thread thread) {
		lock.lock();
		String s = null;
		try {
			s = thread.getName();
		} finally {
			lock.unlock();
		}
		return s;
	}

	public String getName2(Thread thread) {
		return thread.getName();
	}
}
