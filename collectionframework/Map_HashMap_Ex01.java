package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map_HashMap_Ex01 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Woman", "Jenny");
		map.put("Man", "JayPark");
		map.put("Animal", "Dog");
		map.put("Animal", "Cat");

		// HashMap ���
		// ���1. Entry ���
		System.out.println(map);

		// ���2. Entry ��� - Set ���������� �� Key �����ؼ� �� Key�� �ش� Key�� �ش��ϴ� Value ���
		Set<String> keys = map.keySet(); // Set�� �������̽��� new�� ��ü ���� �Ұ�. ���������� ����� Map�� Key ����Ű�� �Ѵ�
		for (String key : keys) {
			System.out.println(key + ": " + map.get(key));
		}
		
		// ���3. Entry ��� - Iterator ���
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ���4. Key�� ���
		System.out.println(map.keySet());

		// ���5. Value�� ���
		System.out.println(map.values());

		// ���6. �� Key�� �ش��ϴ� Value�� ���
		System.out.println(map.get("Woman"));
		System.out.println(map.get("Man"));
		System.out.println(map.get("Animal"));

	}
}
