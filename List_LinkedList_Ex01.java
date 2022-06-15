package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class List_LinkedList_Ex01 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("오렌지");
		list.add("복숭아");
		list.add("수박");

		// LinkedList 출력 방법
		// 방법1. LinkedList에 오버라이딩 된 toString() 호출
		System.out.println(list);

		// 방법2. 향상된 for문 - LinkedList는 배열 형태 가지므로 가능
		for (String str : list) {
			System.out.println(str);
		}

		// 방법3. LinkedList의 get(index) 메소드 호출해 for문 사용
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 방법4. Iterator에 LinkedList 읽어와 출력
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
