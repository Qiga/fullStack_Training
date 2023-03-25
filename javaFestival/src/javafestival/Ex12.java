package javafestival;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		/*
		 * 8자리 정수를 입력받아 반복문을 활용하여 입력받은 정수의 합을 구하여 출력하는 프로그램을 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);

		// 정수를 입력받기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;

		// 8자리 정수를 자릿수 별로 나누어서 더하기
		// 10으로 나눈 나머지가 하나의 자릿수가됨, 이때, 몫을 다시 활용하면
		// 계속해서 1의 자리를 뽑아낼 수 있음

		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}

		System.out.println("합은 " + sum + "입니다.");

		sc.close();

	}
}
