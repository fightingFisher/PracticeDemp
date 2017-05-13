package Socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class clientTest {
	static Socket server;

	public static void main(String[] args) throws Exception {
		server = new Socket(InetAddress.getLocalHost(), 5678);
		// 输入流
		InputStream is = server.getInputStream();
		InputStreamReader inputs = new InputStreamReader(is);
		BufferedReader in = new BufferedReader(inputs);

		// 输出流
		PrintWriter out = new PrintWriter(server.getOutputStream());
		// wt获取控制台输入的东西
		BufferedReader wt = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = wt.readLine();
			System.out.println(InetAddress.getLocalHost()+":"+str);

			out.flush();
			if (str.equals("end")) {
				break;
			}
			System.out.println(in.readLine());
		}
		server.close();
	}

}
