package 简单工厂1;

public class fruitfactory {
	public fruit getFruit(String type) {
		if (type.equals("apple")) {
			return new apple();
		}
		else 
			return new banana();
		 
	}
}


