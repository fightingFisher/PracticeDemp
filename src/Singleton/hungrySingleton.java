package Singleton;

public class hungrySingleton {
	//饿汉式单例类.在类初始化时，已经自行实例化   
	private hungrySingleton() {
	}

	private static hungrySingleton singleton = new hungrySingleton();

	public hungrySingleton getInstance() {
		return singleton;
	}

}
