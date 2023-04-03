import java.util.Scanner;

public class Ex07배열실습_로그인 {
	public static void main(String[] args) {

		// 최대 3명 회원가입이 가능하고
		// 회원가입시 입력한 아이디, 비밀
		// 번호를 입력했을 때에만 로그인
		// 성공!을 출력하는 프로그램을 작
		// 성하시오.
		Scanner sc = new Scanner(System.in);

		int[] member = new int[3];

		int member_count = 0;
		int turn = 0; // 0 = on , 1 = off

		String[] id = new String[member.length];
		String[] pw = new String[member.length];
		
		String in_id;
		String in_pw;

		// 프로그램 실행 turn 값이 변할 때까지 반복

		do {
			// 원하는 옵션 확인하기
			System.out.println("1.회원가입 2.로그인 3.종료");
			switch (sc.nextInt()) {
			// 회원가입 케이스
			case 1:
				System.out.println("===회원가입===");
				if (member_count >= member.length) {
					System.out.println("가능한 회원 수가 초과되었습니다.");
				} else {
					System.out.print("id 입력 : ");
					id[member_count] = sc.next();
					System.out.print("pw 입력 : ");
					pw[member_count] = sc.next();
					member_count++;
				}
				break;
			// 로그인 케이스
			case 2:
				System.out.println("===로그인===");
				System.out.print("id 입력 : ");
				in_id = sc.next();
				System.out.print("pw 입력 : ");
				in_pw = sc.next();
				
				// 반복을 통해서 데이터 확인
				for(int i =0; i<member_count; i++) {
					if (id[i].equals(in_id) && pw[i].equals(in_pw)) {
						System.out.println("로그인 성공!");
						turn = 1;
						break;
					}else {
						if(i==member_count-1) {
							System.out.println("로그인 실패!");
						}
					}
					
				}		    			
				break; //초기화면으로 돌아가기

			// 종료 케이스
			case 3:
				turn = 1; // off
				System.out.println("종료하였습니다.");
				break;
			default :
				System.out.println("올바른 숫자로 입력해주세요");
			}
		} while (turn == 0);
		
		sc.close();

	}
}
