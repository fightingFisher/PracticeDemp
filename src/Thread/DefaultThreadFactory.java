package Thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class DefaultThreadFactory implements ThreadFactory {
	private static final AtomicInteger poolNumber = new AtomicInteger(1);
	// ԭ���� �̳߳ر�š�
	private ThreadGroup group;
	// �߳���
	private final AtomicInteger threadNumber = new AtomicInteger(1);
	// �߳���Ŀ
	private String namePrefix;

	// �߳�ǰ׺

	public DefaultThreadFactory() {
		SecurityManager s = System.getSecurityManager();
		if (s != null) {
			group = s.getThreadGroup();
		} else {
			Thread.currentThread().getThreadGroup();
			// ȡ���߳���;
			namePrefix = "-pool-" + poolNumber.getAndIncrement() + "-thread-";
		}
	}

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(group, r, namePrefix
				+ threadNumber.getAndIncrement(), 0);
		// ���������̵߳ĵط��� �������̵߳��߳��鼰�߳�����
		if (t.isDaemon())
			t.setDaemon(false);
		if (t.getPriority() != Thread.NORM_PRIORITY)
			// ���� Ĭ�����ȼ�
			t.setPriority(Thread.NORM_PRIORITY);
		return t;
	}

}
