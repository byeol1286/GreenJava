package d0405.p10;

public class ThreadExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println("�۾� �������� �̸� : " + threadA.getName());
		
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� �������� �̸� : " + threadB.getName());
		
		threadA.start();
		threadB.start();
	}
}
