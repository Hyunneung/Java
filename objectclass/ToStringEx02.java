package objectclass;

public class ToStringEx02 {

	public static void main(String args[]) {

		Student2[] students = { 
				   new Student2("강호동", 85, 60, 70),
	               new Student2("이승기", 90, 95, 80), 
	               new Student2("유재석", 75, 80, 100), 
	               new Student2("하하", 80, 70, 95), 
	               new Student2("이광수", 100, 65, 80) };
		
		printStudent(students);
		
	}

	static void printStudent(Student2[] objs) {
		System.out.print("==========    학생별   /  과목별 총점구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (Student2 obj : objs) {
			System.out.println(obj.toString());
		}
		for(int j=0;j<45;j++){
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		System.out.println(Student2.korTotal+"\t"
		                  +Student2.engTotal+"\t"
				          +Student2.mathTotal);		
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

		return this.name + "\t" + this.kor + "\t" + this.eng + "\t" + this.math + "\t" + this.getTotal() + "\t"
				+ Math.round(this.getAverage() * 10) / 10.0; // 평균 String.format("%.1f", this.getAverage()) 도 가능
	}
}
