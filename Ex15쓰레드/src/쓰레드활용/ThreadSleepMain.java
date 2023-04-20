package 쓰레드활용;

import java.awt.Toolkit;

public class ThreadSleepMain {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//삐~소리 사용하기 위한 객체 생성
		
		for(int i=1 ; i<=10; i++) {
			toolkit.beep();
			System.out.println("3초 후에 beep음 울림");
			
			
			//try ~catch :예외 처리 -> 런타임 오류(실행오류)를 처리할 때 사용함.
			try {
				Thread.sleep(3000); //1000ms -> 1s
			} catch (Exception e) { //예외 발생시 catch의 바디 실행
				e.printStackTrace();
			} 
			//중지 중에 방해되는 사항이 있다면 어떻게 처리할 지 써줘야함.
			//예외상황이 많은 경우 Exception(모든 예외 상황의 부모)을 사용
		}

	}

}
