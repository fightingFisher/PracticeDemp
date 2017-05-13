package Singleton;
import Singleton.TestSingleton;

public class TestMain {
	
	public static void main(String[] args){
		TestSingleton s1 =TestSingleton.getSingleton();
		s1.setName("sb!!!!");
		TestSingleton s2 = TestSingleton.getSingleton();
		s2.setName("sb22222");
		s1.printIfo(s1.getName());
		s2.printIfo(s2.getName());
		System.out.println(s1==s2);
		
	}
	
	
	
	
	
}
