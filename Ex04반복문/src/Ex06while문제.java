import java.util.Random;
import java.util.Scanner;

public class Ex06while문제 {
	public static void main(String[] args) {

		/*
		 * 1~10까지 정수 중 랜덤으로 2개를 뽑아 사용자가 답을 맞추는 프로그램을 만드시오
		 */

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// rd.nextInt(10) = 0~9사이의 랜덤한 숫자 출력
		int num1 = rd.nextInt(10);
		int num2 = rd.nextInt(10);

		int a =0 ;
		// 스코어 변수 생성
		int suc = 0;
		int fail = 0;

		// life 설정하기
		int life = 3;

		System.out.println("====PLUS GAME====");

		do {
			System.out.printf("%d + %d = ", num1, num2);
			if (num1 + num2 == sc.nextInt()) {
				System.out.println("\r\n" + "\r\n" + "　   SUCCESS\r\n" + "\r\n" + "");
				num1 = rd.nextInt(10);
				num2 = rd.nextInt(10);
				suc++;
			} else {
				System.out.println(
						"▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n" + "████▌▄▌▄▐▐▌█████\r\n" + "████▌▄▌▄▐▐▌▀████\r\n" + "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
				fail++;
				life--;
				
				//목숨이 남았는지 확인
				if (life == 0) {
					System.out.println("Game Over");
					System.out.println("맞은 개수 : " + suc);
					System.out.print("틀린 개수 : " + fail);
					break;
				}
			}
			
			System.out.println("계속하시겠습니까?");
			char ca = sc.next().charAt(0);
			
		//게임 지속여부를 확인
		//switch 반복문과 do~while 활용하기 (Y또는 N만 받기)
		//단, Yese -> Y로 인식하는 문제 발생
		
			do {
			switch (ca) {
				case 'N' : System.out.println("종료!");
					System.out.println("맞은 개수 : " + suc);
					System.out.print("틀린 개수 : " + fail);
					a ++;
					break;
				case 'Y' : break;
				default : System.out.println("Y나 N을 입력해주세요");
						  ca = sc.next().charAt(0);
				}
			}while(ca!='Y'&&ca!='N');
			
			
		// if문을 활용하여 Y/N처리하기
		/*
			if (sc.next().equals("N")) {
				System.out.println("종료!");
				System.out.println("맞은 개수 : " + suc);
				System.out.print("틀린 개수 : " + fail);
				break;
			}else if (sc.next().equals("Y")){
			}else 
		}while(true);
		*/

		}while(a==0);
		sc.close();
	}
}
