package Singleton;

public class hungrySingleton {
	//����ʽ������.�����ʼ��ʱ���Ѿ�����ʵ����   
	private hungrySingleton() {
	}

	private static hungrySingleton singleton = new hungrySingleton();

	public hungrySingleton getInstance() {
		return singleton;
	}

}
