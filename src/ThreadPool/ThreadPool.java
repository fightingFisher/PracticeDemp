package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import ThreadPool.ThreadFactory.ThreadAFactory;

public class ThreadPool {

	static ThreadAFactory threadAfacory = new ThreadAFactory();

	/*
	 * 接口 Java.util.concurrent.ExecutorService 表述了异步执行的机制， 并且可以让任务在后台执行。
	 * 壹個ExecutorService 实例因此特别像壹個线程池。 事实上，在 java.util.concurrent 包中的
	 * ExecutorService 的实现就是壹個线程池的实现。
	 */

	public static void FixedThreadPoolTest() {
		/* 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待 */
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			fixedThreadPool.execute(threadAfacory.create(i));
		}
		fixedThreadPool.shutdown();
		ThreadPoolExecutor
	}

	public static void CacheThreadPoolTest() {
		/*
		 * 可缓存线程池 newCachedThreadPool. 如果线程池长度超过处理需要,可灵活回收空闲线程 若无可回收线程,则新建线程.
		 */
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 20; i++) {
			cachedThreadPool.execute(threadAfacory.create(i));
			try {
				Thread.sleep(3000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		cachedThreadPool.shutdown();
	}

	public static void ScheduledThreadPoolTest() {
		/**
		 * 定长线程池，支持定时及周期性任务执行。
		 */
		ScheduledExecutorService scheduledThreadPoolTest = Executors
				.newScheduledThreadPool(5);

		scheduledThreadPoolTest.schedule(new Runnable() {
			@Override
			public void run() {
				System.out.println("delay 3 seconds");
			}
		}, 3, TimeUnit.SECONDS);
		scheduledThreadPoolTest.shutdown();
	}

	public static void SingleThreadExecutor() {
		/*
		 * 线程化的线程池，它只会用唯一的工作线程来执行任务， 保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
		 */
		ExecutorService singleThreadExecutor = Executors
				.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable() {
				@Override
				public void run() {
					try {
						System.out.println(index);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	public static void main(String[] args) {
		// FixedThreadPoolTest();
		// CacheThreadPoolTest();
		// ScheduledThreadPoolTest();
		SingleThreadExecutor();
	}
}
