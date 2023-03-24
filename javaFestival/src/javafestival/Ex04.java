package javafestival;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오. 
		 * 단, 최대단위는 10000원, 최소단위는 100원
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("총 금액 입력 : ");
		int iMoney = sc.nextInt();

		System.out.println("잔돈 : " + iMoney + "개");
		System.out.println("10000원 : " + iMoney / 10000 + "개");
		System.out.println("5000원 : " + iMoney % 10000 / 5000 + "개");
		System.out.println("1000원 : " + iMoney % 5000 / 1000 + "개");
		System.out.println("500원 : " + iMoney % 1000 / 500 + "개");
		System.out.println("100원 : " + iMoney % 500 / 100 + "개");

		sc.close();
	}

}
