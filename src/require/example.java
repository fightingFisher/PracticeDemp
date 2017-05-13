package require;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.jdt.internal.compiler.apt.model.Factory;

public class example {
	/*
	 * 第一步拿到10个任务 接着 第二部创建10个线程，将这10个任务交由这10个线程执行， 规则：每个线程在执行的任务最多只能有一个
	 * 第三等这10个任务全部做完之后，在去拿10个任务
	 */

	static FThreadFactory factory = new FThreadFactory();

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 1; i < 20; i++) {
			executorService.execute(factory.creaThread(i));
		}
		executorService.shutdown();
		 while (!executorService.isTerminated()) {
		 }
		System.out.println("end");
	}
}
