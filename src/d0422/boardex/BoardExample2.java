package d0422.boardex;

import java.util.Scanner;

public class BoardExample2 {
	private Scanner scanner = new Scanner(System.in);

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
		String menuNo = scanner.nextLine();
		System.out.println();

		switch (menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
		}
	}

	private void exit() {
		System.exit(0);
	}

	private void clear() {
		System.out.println("*** clear() �޼ҵ� �����");
		list();
	}

	private void read() {
		System.out.println("*** read() �޼ҵ� �����");
		list();
	}

	private void create() {
		System.out.println("*** create() �޼ҵ� �����");
		list();
	}

	public static void main(String[] args) {
		BoardExample2 boardExample = new BoardExample2();
		boardExample.list();
	}
}
