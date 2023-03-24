package javafestival;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * 일한 시간을 입력받아 총 임금을 계산하는 시급계산기입니다.
		 * 시급은 5000원이며 8시간보다 초과 근무한 시간에 대해 1.5배의 시급이
		 * 책정됩니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//일한 시간확인(변수설정)
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int pay =0;
		double dPay = 5000*1.5;
		
		//초과근무 확인
		if (time<=8) {
			pay = time*5000;
		}else {
			pay = 8*5000 + (int)((time-8)*dPay);
		}
		
		System.out.println("총 임금은 " + pay + "원 입니다." );
		
		sc.close();
		
	}
}
