package Singleton;

public class TestSingleton {
	String name = null;
	
	private TestSingleton(){
	}
//	����ģʽ
//	private static final TestSingleton singleton = new TestSingleton();
//	  
//	public static TestSingleton getSingleton(){
//		return singleton;
//	}
//	����ģʽ
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
