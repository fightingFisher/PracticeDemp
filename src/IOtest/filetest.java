
package IOtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class filetest{
	public static void main(String[] args) throws IOException{
		FileInputStream file1 = new FileInputStream("in.txt");
		byte[] b = new byte[file1.available()];	
		file1.read(b);
		String str = new String(b);
		System.out.println(str);
	}
	
}
