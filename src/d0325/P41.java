package d0325;

public class P41 {
	public static void main(String[] args) {
		String strVar1 = "JBEdu";
		String strVar2 = "JBEdu";

		if (strVar1 == strVar2) {
			System.out.println("������ ����");
		} else {
			System.out.println("������ �ٸ�");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("�� ���ڿ��� ����");
		}

		String strVar3 = new String("JBEdu");
		String strVar4 = new String("JBEdu");

		if (strVar3 == strVar4) {
			System.out.println("������ ����");
		} else {
			System.out.println("������ �ٸ�");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("�� ���ڿ��� ����");
		}
	}
}