import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class example {
	/*
	 * 第一步拿到10个任务 接着 第二部创建10个线程，将这10个任务交由这10个线程执行，规则：每个线程在执行的任务最多只能有一个
	 * 第三等这10个任务全部做完之后，在去拿10个任务
	 */

	ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	
	
	
	

}
