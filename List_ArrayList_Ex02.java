package collectionframework;

import java.util.ArrayList;

public class List_ArrayList_Ex02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("������");
		list.add("������");
		list.add("����");

		printList(list);

		list.set(0, "��");
		System.out.println("===== list ���� �� =====");
		printList(list);

		list.remove(1); // index=1 ������ �����Ǹ� �� �ڿ� �ִ� index=2 �����Ͱ� ������ �̵��Ѵ�
		System.out.println("===== list ���� �� =====");
		printList(list);

		System.out.println("===== list ������ Ȯ�� =====");
		System.out.println(list.contains("��"));
	}

	static void printList(ArrayList list) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println("index = " + i + ", ������ = " + list.get(i));
		}
	}

}
