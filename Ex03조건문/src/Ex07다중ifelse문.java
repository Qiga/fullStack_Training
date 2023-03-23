import java.util.Scanner;

public class Ex07다중ifelse문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("A, B, C 중 하나 입력 : ");
		String alpha = sc.next();
		
		if(alpha.equals("A")) {
			System.out.println("A입력");
		}else if(alpha.equals("B")) {
			System.out.println("B입력");
		}else if(alpha.equals("C")) {
			System.out.println("C입력");
		}else {
			System.out.print("A, B, C 중 하나 입력해주세요");
		}
	}

}
