package javafestival;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {

		/*
		 * 정수 n을 입력받아 1, 2, 4, 7, 11 과 같은 수열의 n번째 항까지 출력하시오.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("n값 입력 : ");
		int n = sc.nextInt();

		int p = 1;

		for (int i = 0; i != n; i++) {
			p += i;
			System.out.print(p);
			System.out.print(" ");

		}

		sc.close();

	}
}
