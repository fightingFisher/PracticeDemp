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
			// server ������������
			InputStream is = server.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(is));

			// client д�Ķ���
			PrintWriter out = new PrintWriter(server.getOutputStream());
			BufferedReader wt = new BufferedReader(new InputStreamReader(
					System.in));
			while (true) {
				String inputString = wt.readLine();
				out.flush();
				if ("�˳�".equals(inputString)) {
					break;
				}
			}
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ͻ�������ʧ�ܣ�");
		}
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		Client client = new Client();

	}
}
