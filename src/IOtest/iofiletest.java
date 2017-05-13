package IOtest;

import java.io.File;

public class iofiletest {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		list = path.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
