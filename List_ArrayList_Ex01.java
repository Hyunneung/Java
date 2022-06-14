package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList_Ex01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("오렌지");
		list.add("복숭아");
		list.add("수박");

		// ArrayList 출력
		// 방법1. ArrayList에 오버라이딩 된 toString() 호출
		System.out.println(list);

		// 방법2. 향상된 for문 - ArrayList는 배열 형태 가지므로 가능
		for (String str : list) {
			System.out.println(str);
		}

		// 방법3. ArrayList의 get(index) 메소드 호출해 for문 사용
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 방법4. Iterator에 ArrayList 읽어와 출력
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
