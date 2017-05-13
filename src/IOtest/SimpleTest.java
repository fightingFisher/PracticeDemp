package IOtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.ZipInputStream;

public class SimpleTest {

	private static final String path = "E:/JAVA_IMAGE/999.txt";
	private static final String path2 = "E:/JAVA_IMAGE/888.txt";

	public static void main(String[] args) {

		File file = new File(path);
		File file2 = new File(path2);
		System.out.println(file.toString());
		System.out.println(file2.toString());
		try {
			FileInputStream fis2 = new FileInputStream(file2);
			System.out.println("�ҵ���" + file2.toString() + "�ļ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis1 = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
