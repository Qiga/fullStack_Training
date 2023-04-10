package 상품관리;

import java.util.Scanner;

public class Product_simul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product_Sys ps = new Product_Sys();
		String name;
		int price;
		int amount;
		int turn = 0; 
		
		
		while(turn==0) {
		System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
		switch(sc.nextInt()) {
		case 1:
			System.out.print("물건 이름 : ");
			name = sc.next() + sc.nextLine();
			System.out.print("단가 : ");
			price = sc.nextInt();
			System.out.print("수량 : ");
			amount = sc.nextInt();
			ps.addProduct(name, price, amount);
			System.out.println("추가가 완료되었습니다.");
			break;
		case 2:
			ps.checkList();
			break;
		case 3: turn = 1;
			System.out.println("종료하겠습니다");
			break;
		default : System.out.println("숫자를 정확하게 입력해주세요");
		}
		}
	}

}
