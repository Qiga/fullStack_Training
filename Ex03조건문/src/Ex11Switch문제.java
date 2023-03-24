import java.util.Scanner;

public class Ex11Switch문제 {
	public static void main(String[] args) {
		/*
		월(1~12)을 입력받아 해당 월이 봄,여름,가을,겨울 중
		어느 계절인지 출력하시오.
		(1,2,12월 -> 겨울 / 3,4,5월 -> 봄 /
		6,7,8월 -> 여름 / 9/10/11월 -> 가을)
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(1~12) 입력 : ");
		int mon = sc.nextInt();
		
		switch (mon) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("1~12중에 입력하세요");
			
			
		// 15버전 이상부터 가능한 방법
		// case 1,2,12:
		}
		sc.close();
	}
}
