package d0404.p42;

public class Main {
	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-Simon";

		String[] names = text.split("&|,|-");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
