package ThreadPool.ThreadFactory;

import java.util.concurrent.ThreadFactory;

import ThreadPool.Thread.ThreadA;

import com.bnuz.util.StringUtils;

public class ThreadAFactory implements ThreadFactory {
	// 线程工厂
	public ThreadA create(String str) {
		ThreadA result = null;
		if (StringUtils.isNotBlank(str)) {
			int i = Integer.parseInt(str);
			result = new ThreadA(i);
		}
		return result;
	}

	public ThreadA create(int i) {
		return new ThreadA(i);
	}

	@Override
	public Thread newThread(Runnable r) {
		// TODO 自动生成的方法存根
		return null;
	}
}
