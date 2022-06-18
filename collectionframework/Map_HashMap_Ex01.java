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

		// HashMap 출력
		// 방법1. Entry 출력
		System.out.println(map);

		// 방법2. Entry 출력 - Set 참조변수에 각 Key 참조해서 각 Key와 해당 Key에 해당하는 Value 출력
		Set<String> keys = map.keySet(); // Set은 인터페이스로 new로 객체 생성 불가. 참조변수만 만들어 Map의 Key 가리키게 한다
		for (String key : keys) {
			System.out.println(key + ": " + map.get(key));
		}
		
		// 방법3. Entry 출력 - Iterator 사용
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 방법4. Key만 출력
		System.out.println(map.keySet());

		// 방법5. Value만 출력
		System.out.println(map.values());

		// 방법6. 각 Key에 해당하는 Value만 출력
		System.out.println(map.get("Woman"));
		System.out.println(map.get("Man"));
		System.out.println(map.get("Animal"));

	}
}
