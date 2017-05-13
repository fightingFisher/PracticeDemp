package Thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class DefaultThreadFactory implements ThreadFactory {
	private static final AtomicInteger poolNumber = new AtomicInteger(1);
	// 原子类 线程池编号。
	private ThreadGroup group;
	// 线程组
	private final AtomicInteger threadNumber = new AtomicInteger(1);
	// 线程数目
	private String namePrefix;

	// 线程前缀

	public DefaultThreadFactory() {
		SecurityManager s = System.getSecurityManager();
		if (s != null) {
			group = s.getThreadGroup();
		} else {
			Thread.currentThread().getThreadGroup();
			// 取得线程组;
			namePrefix = "-pool-" + poolNumber.getAndIncrement() + "-thread-";
		}
	}

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(group, r, namePrefix
				+ threadNumber.getAndIncrement(), 0);
		// 真正创建线程的地方， 设置了线程的线程组及线程名字
		if (t.isDaemon())
			t.setDaemon(false);
		if (t.getPriority() != Thread.NORM_PRIORITY)
			// 设置 默认优先级
			t.setPriority(Thread.NORM_PRIORITY);
		return t;
	}

}
