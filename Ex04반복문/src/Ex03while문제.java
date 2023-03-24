import java.util.Scanner;

public class Ex03while문제 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int scan = 0;
		int sum = 0;

		//while 활용
	
		
		while (scan != -1) {
			System.out.print("숫자 입력 : ");
			scan = sc.nextInt();
			if (scan != -1)
				sum += scan;
		}
		System.out.println("누적 결과 : " + sum);

		
//		do~while 활용

		scan = 0;
		sum = 0;

		do {
			sum += scan;
			System.out.print("숫자 입력 : ");
			scan = sc.nextInt();
		} while (scan != -1);

		System.out.println("누적 결과 : " + sum);
		
		//입력한 숫자 홀수와 짝수 갯수까지 추가로 세주기
		
		scan = 0;
		sum = 0;
		int odd = 0; //홀수
		int even = 0; //짝수
		
		do {
			sum += scan;
			System.out.print("숫자 입력 : ");
			scan = sc.nextInt();
			if(scan%2==1) {
				odd++;
			}else if (scan%2==0) {
				even++;
			}
		} while (scan != -1);

		System.out.println("누적 결과 : " + sum);
		System.out.println("홀수 개수 : " + odd);
		System.out.println("짝수 개수 : " + even);
		
		sc.close();
		
		
	}
}
