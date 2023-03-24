import java.util.Scanner;

public class Ex12조건문문제 {

	public static void main(String[] args) {
		
		//자판기 만들기 : 번호로 메뉴를 주문하고 거스름돈을 천원/오백원/백원으로 나누어서 얼마나 제공해야 되는지 계산할것 (잔액부족 포함)
		
		Scanner sc = new Scanner(System.in);
		
		//금액 입력
		System.out.print("넣을 금액 : ");
		int input = sc.nextInt();
		
		//메뉴입력
		System.out.print("--메뉴--\n 1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();
		
		
		//메뉴에 따른 가격설정
		int menuPrice = 0;
		
		switch(menu) {
		case 1 :
			menuPrice = 1800;
			break;
		case 2 :
			menuPrice = 2000;
			break;
		case 3 :
			menuPrice = 1200;
			break;
		}
		
		//거스름돈 금액 설정
		int rem = input-menuPrice;
		
		
		//메뉴가격보다 투입금액이 높으면 잔돈에 대한 내용이, 낮으면 잔액부족을 출력
		
		if (input>=menuPrice) {
			System.out.println("잔돈 : " + rem );
			System.out.printf("천원 : " + rem/1000
							+ "\n오백원 : " + (rem-(rem/1000)*1000)/500
							+ "\n백원 : " + (rem-((rem/500)*500))/100);
		}else {
			System.out.println("돈이 부족합니다");
		}
		
		
		/*
		switch (menu) {
		case 1: 
			if (input>=1800) {
				System.out.printf("잔돈 : %d\n", input-1800);
			}else {
				System.out.println("돈이 부족해요");
			}
			break;
		case 2: 
			if (input>=2000) {
				System.out.printf("잔돈 : %d\n", input-2000);
			}else {
				System.out.println("돈이 부족해요");
			}
			break;
		case 3: 
			if (input>=1200) {
				System.out.printf("잔돈 : %d\n", input-1200);
			}else {
				System.out.println("돈이 부족해요");
			}
			break;
		}
		*/
		sc.close();
	}

}
