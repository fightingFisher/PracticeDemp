package SimpleSocket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {
	private final int PORT = 12345;
	private final String serverAddress = "locathost";
	static Socket server;

	public Client() {
		try {
			server = new Socket(serverAddress, PORT);
			// server 传回来的数据
			InputStream is = server.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(is));

			// client 写的东西
			PrintWriter out = new PrintWriter(server.getOutputStream());
			BufferedReader wt = new BufferedReader(new InputStreamReader(
					System.in));
			while (true) {
				String inputString = wt.readLine();
				out.flush();
				if ("退出".equals(inputString)) {
					break;
				}
			}
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("客户端启动失败！");
		}
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		Client client = new Client();

	}
}
