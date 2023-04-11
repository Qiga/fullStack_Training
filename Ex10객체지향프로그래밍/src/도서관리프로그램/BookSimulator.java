package 도서관리프로그램;

import java.util.Scanner;

//사용자와 상호소통하는 인터페이스 (결과출력, 입력 등)
public class BookSimulator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===도서관리프로그램===");
		BookSystem bookmanager = new BookSystem();
		
		while(true) {
			System.out.print("[1]등록 [2]전체조회 [3]종료");
			int choice = sc.nextInt();
			
			if(choice ==1) {
				System.out.print("책 이름 : ");
				String title = sc.nextLine();
				
				System.out.print("책 가격 : ");
				int price = sc.nextInt();
				System.out.println("책 저자 : ");
				String writer = sc.next();
				bookmanager.addBook(title, price, writer);
				System.out.println("책 등록이 완료되었습니다");
			}else if(choice==2) {
				String msg = bookmanager.getBookTitleList();
				System.out.println(msg);
			}else if(choice==3) {
				System.out.println("시스템을 종료합니다");
				break;
			}else {
				System.out.println("올바른 숫자를 입력하세요.");
			}
		}
		sc.close();

	}

}
