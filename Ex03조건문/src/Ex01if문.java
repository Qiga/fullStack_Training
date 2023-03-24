import java.util.Scanner;

public class Ex01if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		// 20살 이상이면 성인입니다 출력, 그렇지 않다면 아무것도 행동하지 않을 것
		// if(조건식 : 결과값이 true or false(비교연산자, 논리연산자)).

		if (age >= 20) {
			System.out.println("성인입니다");
		}

		System.out.println("맨아랫줄");
		
		//dead code : 절대 실행 안되는 코드(의미가 없음)
		/*if(false) {
		}*/
		sc.close();
	}

}

