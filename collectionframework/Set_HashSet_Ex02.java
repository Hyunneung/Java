// �ζ� ��ȣ 6�� ���Ͻÿ� (�ζ� ��ȣ�� ������ 1~45)
package collectionframework;

import java.util.HashSet;

public class Set_HashSet_Ex02 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() != 6) {
			set.add((int) (Math.random() * 45 + 1));
		}

		System.out.println("�̹� �� �ζǹ�ȣ�� " + set + " �Դϴ�.");

	}

}
