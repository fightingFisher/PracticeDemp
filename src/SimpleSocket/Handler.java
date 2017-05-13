package SimpleSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Handler implements Runnable {
	private Socket client;

	public Handler(Socket client) {
		this.client = client;
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println("服务已启动！");
		BufferedReader input;
		try {
			input = new BufferedReader(new InputStreamReader(
					this.client.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream());
			while (true) {
				String inputString = input.readLine();
				System.out.println("客户端(" + InetAddress.getLocalHost() + "):"
						+ inputString);
				String tempString = "客户端(" + InetAddress.getLocalHost() + "):"
						+ inputString;
				out.println(tempString);
				out.flush();
				if ("退出".equals(inputString)) {
					System.out.println("服务关闭");
					break;
				}
			}
			client.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
