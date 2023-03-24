import java.util.Scanner;

public class Ex03if문제 {
	public static void main(String[] args) {

		// java , Python , android 점수를 각각 입력받은 후 평균이 80점 보다 높으면 합격 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("JAVA 점수 입력 : ");
		int jnum = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int pnum = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int anum = sc.nextInt();

		double avg = (jnum + pnum + anum) / 3 ;
				//92.123 > 80 비교를 하게되면 컴퓨터가 80을 실수로 바꾸어 계산함
		
		if (avg > 80) {
			System.out.println("합격");
		}
		
		//추가적으로 80보다 낮거나 같으면 불합격으로 출력하고자 함
		if (avg > 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		sc.close();

	}
}
