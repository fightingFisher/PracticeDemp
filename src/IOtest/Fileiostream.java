package IOtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class Fileiostream {
	private final static int BUFFER_SIZE = 16 * 1024;
	private final static String inrul = "in.txt";
	private final static String outrul = "out.txt";

	public static void main(String args[]) throws IOException {

		// FileInputStream in = null;
		// in = new FileInputStream(new File(inrul));

		/*
		 * 读取文件第一行数据
		 */
		BufferedReader bufr = new BufferedReader(
				new FileReader(new File(inrul)));
		String s = bufr.readLine();
		System.out.println(s);
		bufr.close();

		/*
		 * OutputStream out = null; /* out = new FileOutputStream(outrul); in =
		 * new FileInputStream(inrul); byte[] buffer = new byte[BUFFER_SIZE];
		 * int len = 0; while ((len = in.read(buffer)) > 0) { out.write(buffer,
		 * 0, len); }
		 */
		/*
		 * if (null != out) { out.close(); }
		 */
	}
}
