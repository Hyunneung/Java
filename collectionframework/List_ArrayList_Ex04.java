package collectionframework;

import java.util.ArrayList;

public class List_ArrayList_Ex04 {

	public static void main(String args[]) {

		Student2[] students = { new Student2("강호동", 85, 60, 70), 
								new Student2("이승기", 90, 95, 80),
								new Student2("유재석", 75, 80, 100), 
								new Student2("하하", 80, 70, 95), 
								new Student2("이광수", 100, 65, 80) };

		ArrayList<Student2> stlist = new ArrayList<Student2>();

		for (Student2 st : students) {
			stlist.add(st);
		}

		Student2.sort(stlist);
		printStudent(stlist);
	}

	static void printStudent(ArrayList<Student2> stlist) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");

		for (Student2 st : stlist) {
			System.out.println(st);
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		System.out.println(Student2.korTotal + "\t" + Student2.engTotal + "\t" + Student2.mathTotal);
	}
}

class Student2 {
	String name;
	int kor;
	int math;
	int eng;
	static int korTotal;
	static int mathTotal;
	static int engTotal;

	public Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (getTotal() / 3f);
	}

	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getTotal() + "\t"
				+ String.format("%.1f", getAverage());
	}

	static void sort(ArrayList<Student2> stlist) {
		for (int i = 0; i < stlist.size(); i++) {
			for (int j = i + 1; j < stlist.size(); j++) {
				if (stlist.get(i).getTotal() < stlist.get(j).getTotal()) {
					Student2 imsi = stlist.get(i);
					stlist.set(i, stlist.get(j));
					stlist.set(j, imsi);
				} // if 뮨 끝
			}
		} // for문 끝
	} // sort 메소드 끝
} // class 끝
