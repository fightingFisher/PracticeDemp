package SimpleSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private final static int PORT = 12345;

	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.init();
	}

	private void init() throws IOException {
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("¿ªÊ¼LÅ¶");
		while (true) {
			Socket client = server.accept();
			new Handler(client);
		}
	}
}
