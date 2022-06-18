package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList_Ex01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("������");
		list.add("������");
		list.add("����");

		// ArrayList ���
		// ���1. ArrayList�� �������̵� �� toString() ȣ��
		System.out.println(list);

		// ���2. ���� for�� - ArrayList�� �迭 ���� �����Ƿ� ����
		for (String str : list) {
			System.out.println(str);
		}

		// ���3. ArrayList�� get(index) �޼ҵ� ȣ���� for�� ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// ���4. Iterator�� ArrayList �о�� ���
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
