import java.util.Scanner;

public class Ex08삼항연산문제 {
	public static void main(String[] args) {

		// 노동시간에 따른 급여를 계산하시오 (시급은 9천원이며 8시간초과부터는 기본급여의 1.5배를 지급함)
		// ctrl + shift + f : 자동 줄맞춤
		Scanner sc = new Scanner(System.in);

		System.out.print("노동시간을 입력하세요 : ");
		int wTime = sc.nextInt();
		int def_ttp = 9000;
		
		double pay = (wTime <= 8) ? wTime * def_ttp : (8 * def_ttp + (wTime - 8) * (def_ttp * 1.5));

		System.out.printf("총 임금은 %d원 입니다.", (int)pay );
	}
}
