package collectionframework;

import java.util.LinkedList;

public class List_LinkedList_Ex02 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("������");
		list.add("������");
		list.add("����");
		list.add("��");
		printLL(list);

		list.set(0, "����");
		printLL(list);

		list.remove(2);
		printLL(list);

		list.remove("������");
		printLL(list);
	}

	static void printLL(LinkedList<String> list) {
		System.out.println("=== list ���� �� ===");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
