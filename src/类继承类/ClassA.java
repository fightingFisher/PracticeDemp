package 类继承类;

public class ClassA extends ClassB {
	public ClassA() {
	}

	@Override
	public void play() {
		super.play();
		System.out.println("ClassA");
	}

}
