package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet_Ex03 {

	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		HashSet<String> kyo = new HashSet<String>();
		HashSet<String> hs1cha = new HashSet<String>();
		HashSet<String> hap = new HashSet<String>();
		
		hs1.add("1"); hs1.add("2"); hs1.add("3"); hs1.add("4"); hs1.add("5"); 
		hs2.add("4"); hs2.add("5"); hs2.add("6"); hs2.add("7"); hs2.add("8");
		
		System.out.println("[hs1] = " + hs1);
		System.out.println("[hs2] = " + hs2);

		// 교집합
		Iterator it = hs1.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			if (hs2.contains(tmp)) {
				kyo.add((String) tmp);
			}
		}
		System.out.println("[hs1 ∩ hs2] = " + kyo);

		// hs1 차집합
		it = hs1.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			if (!(hs2.contains(tmp))) {
				hs1cha.add((String) tmp);
			}
		}
		System.out.println("[hs1 - hs2] = " + hs1cha);

		// 합집합
		hap.addAll(hs1);
		hap.addAll(hs2);
		System.out.println("[hs1 ∪ hs2] = " + hap);
	}
}
