import java.util.Scanner;

public class Ex08다중ifelse문제 {

	public static void main(String[] args) {
		/* 버스 단말기에 버스카드를 태그하려고 합니다. 현재 카드 잔액과 탑승자가
		*성인/청소년/어린이 인지 입력한 후 잔액이 충분한 경우에는 인사말을 출력
		*하고 부족한 경우에는 “잔액이 부족합니다”를 출력하시오.
		*(성인 - 감사합니다(1800원) / 청년 - 반갑습니다(1500원) / 어린이 - 안녕하세요(1000원))
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.print("성인/청소년/어린이 : ");
		String age = sc.next();
		
		/*
		if (age.equals("성인")) {
			if (money>=1800) {
				System.out.println("감사합니다");
			}else {
				System.out.println("잔액이 부족합니다");
			}
		}else if (age.equals("청소년")) {
			if (money>=1500) {
				System.out.println("반갑습니다");
			}else {
				System.out.println("잔액이 부족합니다");
			}
		}else if (age.equals("어린이")) {
			if (money>=1000) {
				System.out.println("안녕하세요");
			}else {
				System.out.println("잔액이 부족합니다");
			}
		}else {
			System.out.print("성인/청소년/어린이 중에 하나를 입력하셔야 합니다");
		}
		*/
		
	//코드에 중복을 없애고 간결하게 만들기 
	if (age.equals("성인") && money >= 1800) {
		System.out.println("감사합니다");
	} else if (age.equals("청소년") && money >= 1500) {
		System.out.println("반갑습니다");
	} else if (age.equals("어린이") && money >= 1000) {
		System.out.println("안녕하세요");
	} else {
		System.out.println("잔액이 부족합니다");
	}
	sc.close();

}

}
