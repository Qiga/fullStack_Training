import java.util.Scanner;

public class Ex09for문 {

	public static void main(String[] args) {

		// 1부터 100까지 3의 배수 출력

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("");
		// 3의 배수이면서 5의 배수인 것을 출력할 것

		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("");
		// 한개의 자연수를 받아 해당 자연수의 배수를 차례로 10개 출력

		Scanner sc = new Scanner(System.in);

		System.out.printf("자연수를 입력하세요 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.print(input * i + " ");

		}
		System.out.println("");

		sc.close();
	}
}
