// 익명 클래스
// 현재 시간부터 1초씩 출력하는 프로그램 

package multithread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Multithread_Ex04 {

	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a h시 m분 s초");
				
				while (true) {
					System.out.println(sdf.format(new Date()));
					try {
						Thread.sleep(1000); // 1초
						
					} catch (InterruptedException e) {
						System.err.println(e.getMessage());
					}
				} // while 끝
			} // run 끝
		}); // 익명 클래스 객체 생성 및 구현 끝
		
		th.start();
	}
}
