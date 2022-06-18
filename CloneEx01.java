package objectclass;

import java.util.GregorianCalendar;

public class CloneEx01 {

	public static void main(String[] args) {

		GregorianCalendar gc1 = new GregorianCalendar(); // 객체 생성
		Object obj = gc1.clone(); // 객체 복제
		GregorianCalendar gc2 = (GregorianCalendar) obj; // 형변환

		System.out.printf("[gc1] %tF\n", gc1);
		System.out.printf("[gc2] %tF\n", gc2);

		gc1.set(1996, 01, 21);

		System.out.println("== gc1 변경 후 == ");
		System.out.printf("[gc1] %tF\n", gc1);
		System.out.printf("[gc2] %tF\n", gc2); // gc2는 gc1 객체가 별개로 복제된 것이므로 gc1 값 변경과 무관하다.
	}
}
