public class EgTest {

	static int i;

	public static void main(String[] args) {
		EgTest egt = new EgTest();
		System.out.println(egt.i);
	}

	static {
		i = 99;
	}

}
