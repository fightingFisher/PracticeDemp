package IOtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class WriterTest {

	private final static String InPath = "E:/JAVA_IMAGE/888.txt";
	private final static String OutPath = "E:/JAVA_IMAGE/999.txt";

	public static void main(String[] args) throws IOException {

		File inFile = new File(InPath);
		FileInputStream fis = new FileInputStream(inFile);
		FileReader fr = new FileReader(inFile);
		InputStreamReader isr = new InputStreamReader(fis);

		File outFile = new File(OutPath);
		FileOutputStream fos = new FileOutputStream(outFile);
		FileWriter fw = new FileWriter(outFile);
		OutputStreamWriter osw = new OutputStreamWriter(fos);

	}
}
