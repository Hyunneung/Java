// 1초마다 시간 출력하는 스레드
package multithread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Multithread_Ex01 {

	public static void main(String[] args) {
		TimeThread dt = new TimeThread();
		dt.start();

	}
}

// 스레드 클래스
class TimeThread extends Thread {
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
} // class 끝
