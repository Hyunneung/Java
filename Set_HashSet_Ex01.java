package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet_Ex01 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("�ڹ�Ĩ");
		set.add("����Ǫġ��");
		set.add("����");
		set.add("����");

		// HashSet ���
		// ���1. HashSet�� �������̵� �� toString() ȣ��
		System.out.println(set);

		// ���2. ���� for��
		for (String str : set) {
			System.out.println(str);
		}

		// ���2. Iterator �������̽�
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
