package d0403.p7;

public class MemberExample {
	public static void main(String[] args) {
//		Member obj1 = new Member("blue");
		Member obj1 = new Member();
		Member obj2 = obj1;
//		Member obj3 = new Member("red");
		Member obj3 = new Member();

		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

}
