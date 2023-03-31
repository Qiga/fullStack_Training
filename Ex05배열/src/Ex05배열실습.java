import java.util.Scanner;

public class Ex05배열실습 {

	public static void main(String[] args) {
		
		String[] arrStr = {"김지은", "박수현", "정세연", "이명훈", "강예진", "임명진", "정형", "채수민"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 이름 입력 >> ");
		String name = sc.next();
		
		for (int i =0 ; i<arrStr.length; i++ ) {
			if (arrStr[i].equals(name)) {
				System.out.print(name + "님은 " + i +"번째 인덱스에 저장되어 있습니다." );
				break;
			}
		}
		
		sc.close();
	}
}
