package d0422.boardex;

public class BoardExample1 {
	
	public void list() {
		System.out.println();
		System.out.println("[�Խù� ���]");
		System.out.println("------------------------------------");
		System.out.printf("%-6s^-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("------------------------------------");
		System.out.printf("%-6s^-12s%-16s%-40s\n", "1", "winter", "2022.01.27", "�Խ��ǿ� ���� ���� ȯ���մϴ�.");
		mainMenu();
	}

	private void mainMenu() {
		System.out.println();
		System.out.println("[�Խù� ���]");
		System.out.println("------------------------------------");
		System.out.println("���� �޴�: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.println("�޴� ���� : ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		BoardExample1 boardExample = new BoardExample1();
		boardExample.list();
	}
}
