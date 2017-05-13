package Singleton;

public class TestSingleton {
	String name = null;
	
	private TestSingleton(){
	}
//	饿汉模式
//	private static final TestSingleton singleton = new TestSingleton();
//	  
//	public static TestSingleton getSingleton(){
//		return singleton;
//	}
//	懒汉模式
	private static TestSingleton singleton = null;
	
	public static TestSingleton getSingleton(){
		if(singleton==null){
		 singleton =  new TestSingleton();
		}
		return singleton;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printIfo(String name){
		System.out.println(name);
	}
	
	

}
