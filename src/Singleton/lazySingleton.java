package Singleton;


public class lazySingleton{
	// ����ʽ����
	private lazySingleton() {
		// ��Զֻ��ִ��һ��.
		System.out.println("�������� ");
	}
	private static lazySingleton singleton = null;
	public static lazySingleton getInstance() {
		// ����ͨ��getInstacne��������ȡ ʵ������Singleton,
		// ���singleton�ڵ�ǰʵ������һ���ˡ� �Ͳ�����ʵ��������ֻ֤��һ��Singleton��
		// Singletonͨ�������췽���޶�Ϊprivate�����������ⲿ��ʵ��������ͬһ���������Χ�ڣ�Singleton��Ψһʵ��ֻ��ͨ��getInstance()�������ʡ�
		if (singleton == null) {
			singleton = new lazySingleton();
		}
		return singleton;
	}

}
