import java.util.Scanner;

public class Ex06배열실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] answer = {1,4,3,2,1};
		int[] write = new int[answer.length];
		int total = 0;
		
		for (int i = 0; i<answer.length; i++) {
			System.out.print(i+1 + "번답 >> ");
			write[i] = sc.nextInt();
		}
		System.out.println("정답확인");
		for (int i = 0; i<answer.length; i++) {
			if (answer[i]==write[i]) {
				System.out.print("O"+ " ");
				total += 100/answer.length;
			}else {
				System.out.print("X"+ " ");
			}
		}
		
		System.out.print("총점 : " + total);
//스캐너 종료
		sc.close();
	}

}
