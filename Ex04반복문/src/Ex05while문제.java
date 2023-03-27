import java.util.Scanner;

public class Ex05while문제 {
	public static void main(String[] args) {
		
		/*
		사용자가 입력한 아이디가 “smhrd”이고 비밀번호가 “1234”인 경우만
		로그인 될 수 있도록 하고 그렇지 않은 경우에는 로그인 할 수 없는
		로그인 프로그램을 작성하시오. (단, 입력기회는 3번)
		*/
		
		Scanner sc = new Scanner(System.in);
		
		//id, pw설정
		String id = "smhrd";
		String pw = "1234";
		
		// 시도기회 설정
		int count = 3;
		
		
		//아이디 패스워드 입력하기
		do {
			System.out.print("아이디 : ");
			String scanid = sc.next();
			System.out.print("패스워드 : ");
			String scanpw = sc.next();
			
			//일치여부 확인하기
			if (id.equals(scanid) && pw.equals(scanpw) ) {
				System.out.println("로그인 성공");
				break;
			}else {
				
				//로그인 실패시 행동
				System.out.println("로그인 실패");
				count--;
				
				//남은 기회 확인하기
				if (count == 0 ) {
					System.out.println("본인인증을 해주세요");
				}else {
					
					//재시도 여부 확인
					System.out.print("계속하시겠습니까?");
					String yn = sc.next();
					if (yn.equals("N")) {
						System.out.println("종료");
						break;
					}else if (yn.equals("Y")) {
						;
					}else break;
			   }
			}
		
		}while (count>0);
		
		sc.close();
		
	}
}
