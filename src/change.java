public class change {
	public static String change1(String s) {
		while (s.contains("  ")) {
			s.replace("  ", " ");
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "s    b";
		System.out.println(change1(s));

	}

}
