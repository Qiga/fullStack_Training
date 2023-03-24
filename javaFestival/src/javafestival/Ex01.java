package javafestival;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
	/*
	  현재몸무게와 목표몸무게를 각각 입력 받고
	  주차 별 감량몸무게를 입력 받아 목표 달성 시
	  축하 메세지를 띄우는 프로그램을 구현하시오.*/
	  
	  Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		int week=1;
		
		while (now>goal) {
			System.out.print(week +"주차 감량 몸무게 : ");
			int less = sc.nextInt();
			week ++;
			now -= less;
		}
		 System.out.println(now+ "kg 달성!!" + "축하합니다!");
		
		sc.close();
	 
}
}
