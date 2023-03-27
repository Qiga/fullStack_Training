import java.util.Random;
import java.util.Scanner;

public class Ex07숫자맞추기게임 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int answer = rd.nextInt(100)+1;
		//입력값 초기화
		int input = 0;
		
		//시작문구
		System.out.println("=====1부터 100 사이의 숫자 맞추기 게임!=====");
		
		// 입력값과 답안이 일치하는지 확인(반복)
		while(answer != input) {
			
			//입력값 받기
			System.out.print("1과 100사이의 정수를 입력하세요 >>");
			input = sc.nextInt();
			
			//받은 입력값 조건 비교하기
			if (answer>input) {
				System.out.println("더 큰수를 입력해주세요" );
			}else if(answer<input){
				System.out.println("더 작은 수를 입력해주세요" );
			}else {
				System.out.println(answer+"정답입니다 !");
			}
		}
		sc.close();
	}
}
