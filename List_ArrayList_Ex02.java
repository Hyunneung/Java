package collectionframework;

import java.util.ArrayList;

public class List_ArrayList_Ex02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("오렌지");
		list.add("복숭아");
		list.add("수박");

		printList(list);

		list.set(0, "귤");
		System.out.println("===== list 수정 후 =====");
		printList(list);

		list.remove(1); // index=1 데이터 삭제되면 그 뒤에 있던 index=2 데이터가 앞으로 이동한다
		System.out.println("===== list 삭제 후 =====");
		printList(list);

		System.out.println("===== list 데이터 확인 =====");
		System.out.println(list.contains("귤"));
	}

	static void printList(ArrayList list) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println("index = " + i + ", 데이터 = " + list.get(i));
		}
	}

}
