package d0404.p33;

public class Main {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";

//		int location = subject.indexOf("���α׷���");
		int location = subject.indexOf("���α׷�");
		System.out.println("location : " + location);

		if (subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ������ �ֽ��ϴ�.");
		} else {
			System.out.println("�ڹٿ� ������ �����ϴ�.");
		}
	}
}
