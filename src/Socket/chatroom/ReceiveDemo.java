package Socket.chatroom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo implements Runnable {
	private DatagramSocket ds;

	public ReceiveDemo(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			while (true) {
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				System.out.println("pory----" + port);
				String text = new String(dp.getData(), 0, dp.getLength());
				System.out.println(ip + ":" + text);
				if ("886".equals(text)) {
					System.out.println(ip + "退出了");
				}
			}
		} catch (Exception ex) {

		}

	}

}
