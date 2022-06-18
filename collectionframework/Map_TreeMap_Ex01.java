package collectionframework;

import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMap_Ex01 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("Woman", "Jenny");
		map.put("Man", "JayPark");
		map.put("Animal", "Dog");
		map.put("Animal", "Cat");

		// HashMap ���
		// ��� 1. Entry ���
		System.out.println(map);

		// ��� 2. Entry ��� - Set ���������� �� Key �����ؼ� �� Key�� �ش� Key�� �ش��ϴ� Value ���
		Set<String> keys = map.keySet(); // Set�� �������̽��� new�� ��ü ���� �Ұ�. ���������� ����� Map�� Key ����Ű�� �Ѵ�
		for (String key : keys) {
			System.out.println(key + ": " + map.get(key));
		}

		// ��� 3. Key�� ���
		System.out.println(map.keySet());

		// ��� 4. Value�� ���
		System.out.println(map.values());

		// ��� 5. �� Key�� �ش��ϴ� Value�� ���
		System.out.println(map.get("Woman"));
		System.out.println(map.get("Man"));
		System.out.println(map.get("Animal"));

	}
}
