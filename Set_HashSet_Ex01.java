package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet_Ex01 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("자바칩");
		set.add("프라푸치노");
		set.add("국비");
		set.add("한잔");

		// HashSet 출력
		// 방법1. HashSet에 오버라이딩 된 toString() 호출
		System.out.println(set);

		// 방법2. 향상된 for문
		for (String str : set) {
			System.out.println(str);
		}

		// 방법2. Iterator 인터페이스
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
