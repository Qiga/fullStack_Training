import java.util.Scanner;

public class Ex04ifelse문 {
	public static void main(String[] args) {
		
		// 점심먹고 더치페이를 진행하는데, 인당금액에 대해 10000원 이상, 10000원 미만 출력해주기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 금액 : ");
		int lunch = sc.nextInt();
		
		System.out.print("사람 명수 : ");
		int man = sc.nextInt();
		
		if (lunch/man >= 10000) {
			System.out.println("10000원 이상");
		}else {
			System.out.println("10000원 미만");
		}
		
		sc.close();
	}
}
