package collectionframework;

import java.util.ArrayList;

public class List_ArrayList_Ex03 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		list1.add("��");
		list1.add("����");
		list2.add("��");
		list2.add("����");
		list2.add("����");
		list2.add("�ܿ�");
		list2.add("��");
		list2.add("����");
		list2.add("����");
		list2.add("�ܿ�");

		System.out.println(list1);
		System.out.println(list2);

		System.out.println("=== list2���� list1�� ��ġ�� ������ ���� (for�� ���) ===");
		
		// list2 �տ������� �˻��� ����
		for (int i = 0; i < list2.size(); i++) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
				i--;
			}
		}
		
		// list2 �ڿ������� �˻��� ����
//		for (int i = list2.size() - 1; i >= 0; i--) {
//			if (list1.contains(list2.get(i))) {
//				list2.remove(i);
//			}
//		}

		System.out.println(list1);
		System.out.println(list2);

	}

}
