package d0404.p50;

import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };
		Integer[] scores2 = { 99, 68, 36, 29, 88 };

//		Arrays.sort(scores);
//		Arrays.sort(scores, Collections.reverseOrder());
		Arrays.sort(scores2, Collections.reverseOrder());
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores2[" + i + "]=" + scores2[i]);
		}

		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}

		String[] names2 = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names, Collections.reverseOrder());
		for (int i = 0; i < names2.length; i++) {
			System.out.println("names[" + i + "]=" + names2[i]);
		}

	}
}
