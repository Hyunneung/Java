package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class List_LinkedList_Ex01 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("������");
		list.add("������");
		list.add("����");

		// LinkedList ��� ���
		// ���1. LinkedList�� �������̵� �� toString() ȣ��
		System.out.println(list);

		// ���2. ���� for�� - LinkedList�� �迭 ���� �����Ƿ� ����
		for (String str : list) {
			System.out.println(str);
		}

		// ���3. LinkedList�� get(index) �޼ҵ� ȣ���� for�� ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// ���4. Iterator�� LinkedList �о�� ���
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
