package Singleton;


public class lazySingleton{
	// 懒汉式单例
	private lazySingleton() {
		// 永远只会执行一次.
		System.out.println("阿大声道 ");
	}
	private static lazySingleton singleton = null;
	public static lazySingleton getInstance() {
		// 这里通过getInstacne方法来获取 实例化的Singleton,
		// 如果singleton在当前实例化过一次了。 就不会再实例化。保证只有一个Singleton。
		// Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，Singleton的唯一实例只能通过getInstance()方法访问。
		if (singleton == null) {
			singleton = new lazySingleton();
		}
		return singleton;
	}

}
