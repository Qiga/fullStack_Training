import java.util.Scanner;

public class Ex04while문제 {

	public static void main(String[] args) {

		/*
		사용자가 입력한 목표몸무게가 될때 까지
		각 주차별로 감량한 몸무게를 입력받고 목
		표몸무게가 되면 입력을 중단하는 프로그
		램을 작성하시오
		*/
		
		Scanner sc = new Scanner(System.in);
		
		//현재몸무게, 목표 몸무게 입력받기
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		//주차 설정
		int week=1;
		
		//목표 몸무게와 현재 몸무게 대조하기 
		while (now>goal) {
			System.out.print(week +"주차 감량 몸무게 : ");
			int less = sc.nextInt();
			week ++;
			now -= less;
			System.out.println("현재몸무게 : " + now);
		}
		 System.out.println("최종몸무게 : " + now);
		 System.out.println("축하합니다!!!");
		
		sc.close();
	}

}
