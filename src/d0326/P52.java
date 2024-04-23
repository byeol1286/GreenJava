package d0326;

import java.util.Calendar;

public class P52 {
	enum Week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};

	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();
		int iWeek = cal.get(Calendar.DAY_OF_WEEK);

		switch (iWeek) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("���� ���� : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("������ ���� �� �Դϴ�.");
		} else {
			System.out.println("������ �����ϴ� �� �Դϴ�.");
		}
	}
}