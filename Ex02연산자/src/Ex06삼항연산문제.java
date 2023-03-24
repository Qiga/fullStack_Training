import java.util.Scanner;

public class Ex06삼항연산문제 {
 public static void main(String[] args) {
	
	 // 두개의 정수를 입력 받아 큰 수에서 작은 수를 뺀 결과값을 출력하세요.
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("첫번째 정수 입력 : ");
	 int iFst = sc.nextInt(); 
	 
	 System.out.println("두번째 정수 입력 : ");
	 int iSnd = sc.nextInt();
	 
	 System.out.printf("두 수의 차 : %d", (iFst>iSnd)?iFst-iSnd:iSnd-iFst);
	 
	 sc.close();
}
}
