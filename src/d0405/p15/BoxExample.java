package d0405.p15;

import java.util.Stack;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("ȫ�浿");
		String str = box1.get();
		System.out.println(str);

		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}
}
