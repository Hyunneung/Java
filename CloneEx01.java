package objectclass;

import java.util.GregorianCalendar;

public class CloneEx01 {

	public static void main(String[] args) {

		GregorianCalendar gc1 = new GregorianCalendar(); // ��ü ����
		Object obj = gc1.clone(); // ��ü ����
		GregorianCalendar gc2 = (GregorianCalendar) obj; // ����ȯ

		System.out.printf("[gc1] %tF\n", gc1);
		System.out.printf("[gc2] %tF\n", gc2);

		gc1.set(1996, 01, 21);

		System.out.println("== gc1 ���� �� == ");
		System.out.printf("[gc1] %tF\n", gc1);
		System.out.printf("[gc2] %tF\n", gc2); // gc2�� gc1 ��ü�� ������ ������ ���̹Ƿ� gc1 �� ����� �����ϴ�.
	}
}
