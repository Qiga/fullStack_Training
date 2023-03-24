import java.util.Scanner;

public class Ex12조건문문제_팀 {
	public static void main(String[] args) {		
		//자판기 만들기 : 번호로 메뉴를 주문하고 거스름돈을 천원/오백원/백원으로 나누어서 얼마나 제공해야 되는지 계산할것 (잔액부족 포함)
		
		Scanner sc = new Scanner(System.in);
		
		//금액 입력
		System.out.print("넣을 금액 : ");
		int input = sc.nextInt();
		
		//메뉴입력
		//가시성을 위해 프린트문 분리
		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();
		
		
		//스캐너 종료
		sc.close();
		
		//메뉴에 따른 가격설정 
		//default값 설정
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
		default:
			System.out.println("메뉴를 다시 입력해주세요.");
			break;
		}
		
		//거스름돈 금액 설정
		//돈이 부족할 때도 메뉴 가격을 제해서 음수값으로 나오는 문제 해결하기 위해 초기값만 지정
		int output=0;
		
		
		//메뉴가격보다 투입금액이 높으면 잔돈에 대한 내용이, 낮으면 잔액부족을 출력
	
		if (input>=menuPrice) {
			output = input-menuPrice; //금액이 충분할떄만 제거
			System.out.println("잔돈 : " + output + "원");
		}else {
			System.out.println("돈이 부족합니다");
			output = input; //금액이 부족하면 넣은 금액 그대로 반환
		}
		
		
		//잔돈 반환 금액
		//%1000%500 -> %500 으로 변경 (500으로 나누어지기 때문에)
		System.out.printf("천원 : " + output/1000
						+ "\n오백원 : " + output%1000/500
						+ "\n백원 : " + output%500/100);
		
		
	}
}
