import java.util.Scanner;

public class Ex06다중ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		//90점 이상 a
		//80점 이상 90미만 b
		//70점 이상 80미만 c
		//70미만 f
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score>=80) { //위에서 90이상은 다 걸러졌기에 90미만은 또 확인할 필요가 없음
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		sc.close();
	}
}
