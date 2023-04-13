import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		//View 역할 수행 : 사용자 인터페이스 (화면, 선택할 수 있게 하는 기능)
		
		//재생, 정지, 다음곡, 이전곡, 종료
		
		//Controller 기능에 접근하기 위한 객체
		Controller c = new Controller();  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		boolean power = true;
		System.out.println("\r\n"
				+ " ____     ___  __    __   ____  ____  ____    _____ ____   _       ____  __ __    ___  ____  \r\n"
				+ "|    \\   /  _]|  T__T  T |    |l    j|    \\  / ___/|    \\ | T     /    T|  T  T  /  _]|    \\ \r\n"
				+ "|  _  Y /  [_ |  |  |  | l__  | |  T |  _  Y(   \\_ |  o  )| |    Y  o  ||  |  | /  [_ |  D  )\r\n"
				+ "|  |  |Y    _]|  |  |  | __j  | |  | |  |  | \\__  T|   _/ | l___ |     ||  ~  |Y    _]|    / \r\n"
				+ "|  |  ||   [_ l  `  '  !/  |  | |  | |  |  | /  \\ ||  |   |     T|  _  |l___, ||   [_ |    \\ \r\n"
				+ "|  |  ||     T \\      / \\  `  | j  l |  |  | \\    ||  |   |     ||  |  ||     !|     T|  .  Y\r\n"
				+ "l__j__jl_____j  \\_/\\_/   \\____j|____jl__j__j  \\___jl__j   l_____jl__j__jl____/ l_____jl__j\\_j\r\n"
				+ "                                                                                             \r\n"
				+ "");
		while(power) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5] 종료 >> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				c.play();
				c.show();
				break;
			case 2:
				c.stop();
				break;
			case 3:
				c.next();
				c.show();
				break;
			case 4:
				c.pre();
				c.show();
				break;
			case 5: power=false;
					c.stop();
					break;
				
			
			}
		}

	}

}
