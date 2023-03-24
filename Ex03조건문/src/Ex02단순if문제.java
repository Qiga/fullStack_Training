import java.util.Scanner;

public class Ex02단순if문제 {
 public static void main(String[] args) {
	
	 // 입력받은 수가 3또는5의 배수이면 3또는 5의 배수라고 출력하기
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("숫자 입력 : ");
	 int num = sc.nextInt();
	 
	 if (num%3==0 || num%5==0) {
		 System.out.println("3 또는 5의 배수입니다");
	 }
	 sc.close();
}
}
