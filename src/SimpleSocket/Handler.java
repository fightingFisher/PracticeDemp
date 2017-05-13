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
		System.out.println("������������");
		BufferedReader input;
		try {
			input = new BufferedReader(new InputStreamReader(
					this.client.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream());
			while (true) {
				String inputString = input.readLine();
				System.out.println("�ͻ���(" + InetAddress.getLocalHost() + "):"
						+ inputString);
				String tempString = "�ͻ���(" + InetAddress.getLocalHost() + "):"
						+ inputString;
				out.println(tempString);
				out.flush();
				if ("�˳�".equals(inputString)) {
					System.out.println("����ر�");
					break;
				}
			}
			client.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
