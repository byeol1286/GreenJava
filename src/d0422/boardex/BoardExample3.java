package d0422.boardex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample3 {
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;

	public BoardExample3() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "C##GREEN", "GREEN1234");
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}

	public void list() {
		System.out.println();
		System.out.println("[�Խù� ���]");
		System.out.println("----------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("----------------------------------------");
//		System.out.printf("%-6s^-12s%-16s%-40s\n", "1", "winter", "2022.01.27", "�Խ��ǿ� ���� ���� ȯ���մϴ�.");

		try {
			String sql = "" + "SELECT bno, btitle, bcontent, bwriter, bdate " + "FROM boards " + "ORDER BY bno DESC";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBno(), board.getBwriter(), board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}

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
		System.out.println("[�Խù� �б�]");
		System.out.print("bno : ");
		int bno = Integer.parseInt(scanner.nextLine());

		try {
			String sql = ""
					+ "SELECT bno, btitle, bcontent, bwriter, bdate "
					+ "FROM boards "
					+ "WHERE bno=?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("##############");
				System.out.println("��ȣ : " + board.getBno());
				System.out.println("���� : " + board.getBtitle());
				System.out.println("���� : " + board.getBcontent());
				System.out.println("�ۼ��� : " + board.getBwriter());
				System.out.println("��¥ : " + board.getBdate());
				System.out.println("##############");
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}

	private void create() {
		Board board = new Board();
		System.out.println();
		System.out.println("[�� �Խù� �Է�]");
		System.out.print("��  �� : ");
		board.setBtitle(scanner.nextLine());
		System.out.print("��  �� : ");
		board.setBcontent(scanner.nextLine());
		System.out.print("�ۼ��� : ");
		board.setBwriter(scanner.nextLine());

		System.out.println("----------------------------------------");
		System.out.println("���� �޴� : 1.OK | 2.Cancel");
		System.out.println("�޴� ���� : ");
		String menuNo = scanner.nextLine();
		if (menuNo.equals("1")) {
			try {
				String sql = "" + "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate) "
						+ "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";

				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}

	public static void main(String[] args) {
		BoardExample3 boardExample = new BoardExample3();
		boardExample.list();
	}
}
