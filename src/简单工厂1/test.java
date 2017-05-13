package 简单工厂1;


public class test{
	public static void main(String[] args) {
		fruitfactory factory = new fruitfactory();
		String type="apple";
		factory.getFruit(type).print();
		
		
		
		
	}
	
	
	
	
	
	
}
