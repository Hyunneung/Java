package collectionframework;

import java.util.LinkedList;

public class List_LinkedList_Ex02 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("¿À·»Áö");
		list.add("º¹¼þ¾Æ");
		list.add("¼ö¹Ú");
		list.add("±Ö");
		printLL(list);

		list.set(0, "Æ÷µµ");
		printLL(list);

		list.remove(2);
		printLL(list);

		list.remove("º¹¼þ¾Æ");
		printLL(list);
	}

	static void printLL(LinkedList<String> list) {
		System.out.println("=== list ¼öÁ¤ ÈÄ ===");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
