package d0408.p38;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		if (ts.add("korea")) {
			System.out.println("�� ° korea �߰� ����");
		} else {
			System.out.println("�� ° korea �߰� ����");
		}

		if (ts.add("china")) {
			System.out.println("�� ° china �߰� ����");
		} else {
			System.out.println("�� ° china �߰� ����");
		}

		if (ts.add("america")) {
			System.out.println("�� ° america �߰� ����");
		} else {
			System.out.println("�� ° america �߰� ����");
		}

		if (ts.add("china")) {
			System.out.println("�� ° china �߰� ����");
		} else {
			System.out.println("�� ° china �߰� ����");
		}

		System.out.println("Iterator�� ��ü ���� ��ȸ -------------");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
