import java.util.Scanner;

public class Ex11for문 {
	
	public static void main(String[] args) {
		
		//입력받은 정수의 약수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i<=num; i++) {
			if (num%i==0) {
				System.out.print(i + " ");
			}
		}
		
		// 약수이기 때문에 절반까지만 약수를 구하고 마지막에 자신을 출력하는 방법
		sc.close();	
	
	}
}
