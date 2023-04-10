package PiggyBank클래스설계;

import java.util.Scanner;

public class PiggyBank {
	
	Scanner sc= new Scanner(System.in);
	int money;
	
	public PiggyBank() {
		System.out.println("돼지저금통 생성!!");
	}
	
	public void deposit() {
		money += sc.nextInt();
	}
	
	public void withdraw(int outputMoney) {
		if(money >= outputMoney) {
		  money -= outputMoney;
		}
	}
	
	public int showMoney() {
		return money;
	}

}
