package PiggyBank클래스설계;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PiggyBank pb = new PiggyBank();
		
		// 입급 기능 
		System.out.print("입금할 금액 입력 : ");
		pb.deposit();
		
		//출금기능
		System.out.print("출금할 금액 입력 : ");
		pb.withdraw(sc.nextInt()); 
		
		int m = pb.showMoney();
		System.out.println(m + "원 남았습니다.");
	}

}
