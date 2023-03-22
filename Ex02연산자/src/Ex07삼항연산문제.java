import java.util.Scanner;

public class Ex07삼항연산문제 {
	public static void main(String[] args) {
		// 농구공을 담기 위한 상자의 개수
		// 상자하나에 농구공은 5개

		Scanner sc = new Scanner(System.in);

		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();

		System.out.printf("필요한 상자의 수 : %d", (ball % 5 == 0) ? ball / 5 : ball / 5 + 1);

	}
}
