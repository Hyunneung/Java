package collectionframework;

import java.util.ArrayList;

public class List_ArrayList_Ex03 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		list1.add("봄");
		list1.add("여름");
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");

		System.out.println(list1);
		System.out.println(list2);

		System.out.println("=== list2에서 list1과 겹치는 데이터 제거 (for문 사용) ===");
		
		// list2 앞에서부터 검사해 삭제
		for (int i = 0; i < list2.size(); i++) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
				i--;
			}
		}
		
		// list2 뒤에서부터 검사해 삭제
//		for (int i = list2.size() - 1; i >= 0; i--) {
//			if (list1.contains(list2.get(i))) {
//				list2.remove(i);
//			}
//		}

		System.out.println(list1);
		System.out.println(list2);

	}

}
