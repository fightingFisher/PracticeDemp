package Socket.chatroom;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {

	public static void main(String[] args) throws Exception {
		DatagramSocket send = new DatagramSocket();
		DatagramSocket rec = new DatagramSocket(10001);
		new Thread(new SendDemo(send)).start();// 启动发送端线程
		new Thread(new ReceiveDemo(rec)).start();// 启动接收端线程
	}

}
