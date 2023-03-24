package javafestival;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오

		/*
		 * *
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 :");
		int line = sc.nextInt();

		int count = 1;
		String star = "*";

		while (count <= line) {
			for (int i = count; i > 0; i--) {
				System.out.print(star);
			}
			System.out.println("");
			count++;

		}
		sc.close();
	}

}
