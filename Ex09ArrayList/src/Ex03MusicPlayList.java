import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> music = new ArrayList<String>();
		boolean button = true;
		String name;
		int index; 
		
		do {
			System.out.println();
			System.out.println("[1] 노래 추가 [2] 노래 삭제 [3] 종료");
			switch(sc.nextInt()) {
			case 1:list(music);
					System.out.println("[1] 마지막 위치에 추가  [2]원하는 위치에 추가 >>");
					if(sc.nextInt() == 1) {
						System.out.println("추가할 노래 입력 : " );
						name = sc.nextLine();
						music.add(name);
						System.out.println("추가가 완료되었습니다");
						break;
					}else{
						System.out.println("추가할 노래 입력 : " );
						name = sc.nextLine();
						System.out.println("추가할 위치 입력 : ");
						index = sc.nextInt();
						music.add(index-1, name);
						System.out.println("추가가 완료되었습니다");
						break;
					}				
				
			case 2:list(music);
					if(music.isEmpty()) {
						break;
					}
					System.out.println("[1] 선택삭제  [2] 전체 삭제 >>");
					if(sc.nextInt() ==1) {
						System.out.println("삭제할 노래 선택 >> ");
						music.remove(sc.nextInt()-1);
						System.out.println("노래가 삭제되었습니다.");
						break;				
					}else {
						music.clear();
						System.out.println("전체 노래가 삭제되었습니다");
						break;
					}
					
			case 3: System.out.println("프로그램이 종료되었습니다.");
					button = false;
					break;
			}
		}while(button);

	}
	public static void list(ArrayList<String> a) {
		System.out.println("========== 현재 재생 목록 ==========="); 
		if(a.isEmpty()) {
			System.out.println("재생목록이 없습니다");
		}else {
			for(int i = 0; i<a.size(); i++) {
				System.out.println(i+1 +". "+ a.get(i));
			}
		}
		System.out.println("==================================");
	}
				
}
