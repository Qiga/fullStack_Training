package javafestival;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		
		//랜덤으로 정수2개를 뽑아 출력 ( 0 + 0 = )
		//사용자가 합을 출력
		//일치하면 success , 일치하지 않으면 fail출력
		//기회는 5회 틀리면 game over
		
		Scanner sc = new Scanner(System.in);
		
		double a ;
		double b ;
		int life = 5;
		
		do {
			a = Math.random()*10;
			b = Math.random()*10;
			int sum = (int)a +(int)b;
			
			System.out.printf("%d + %d = ", (int)a, (int)b);
			int answer = sc.nextInt();
				if (answer == sum) {
					System.out.println("success");
					break;
				}else {
					life--;
					System.out.println(life==0?"Gameover":"fail");
				}
		}while (life > 0);
			
		sc.close();
	}
}
