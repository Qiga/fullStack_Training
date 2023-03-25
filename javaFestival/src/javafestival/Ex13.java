package javafestival;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {

		// 단수와 곱해지길 원하는 수를 입력하여 단을 표현해주시오

		Scanner sc = new Scanner(System.in);

		System.out.println("단수 입력 : ");
		int single = sc.nextInt();

		System.out.println("어느 수까지 출력 : ");
		int snd_num = sc.nextInt();

		System.out.println(single + "단");
		for (int i = 1; i <= snd_num; i++) {
			System.out.printf("%d * %d = %d \n", single, i, single * i);
		}

		sc.close();
	}
}
