package 숫자게임만들기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-- 숫자 맛추기 게임 Start --");
		GameDummy game = new GameDummy();
		Scanner sc = new Scanner(System.in);
		
		int round = 1;
		
		System.out.println("그 정도면\r\n"
				+ "개혜잔데?⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠈⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡸⢤⣡⣴⣶⣾⣿⣿⣷⣾⣥⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⡙⠚⠀⠀⠀⠀⢀⣀⡀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣠⣴⣶⣶⣶⣦⠀⠀\r\n"
				+ "⠀⠀⠀⠠⣌⡁⠀⠀⢠⣾⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀\r\n"
				+ "⠀⠀⠀⢐⡂⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠃⠀⠀\r\n"
				+ "⠀⠀⠠⢄⠈⠉⠀⠀⠀⠀⠉⠛⠋⢡⣿⡿⠛⠻⣿⣿⣿⡟⠛⠻⣿⣿⣿⡷⣄⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠐⠒⠒⠀⠀⠀⠀⣀⣤⡖⠭⢹⣿⠁⠰⢂⣿⣿⣿⠀⠟⠀⣼⣿⣿⠒⠤⣉⢒⣤⡀⠀⠀\r\n"
				+ "⠀⠀⠠⠦⠀⠀⢀⣴⣿⣿⣿⡟⠊⣿⣿⣦⣴⣿⣿⣿⣿⣷⣶⣾⣿⣿⣿⣶⣶⣾⣿⣿⣿⣦⠀\r\n"
				+ "⠀⠀⠉⣀⠀⢰⣿⣿⣿⣿⣿⠀⢠⡿⠛⠛⠛⠛⠻⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿");
		
		while(true) {
			String temp = round + "라운드 : " + game.getQuizMsg() + " = ";
			while(true) {
			System.out.println(temp);
			if(game.checkAnswer(sc.nextInt())){
				System.out.println("정답입니다!");
				break;
			}else {
				System.out.println("틀렸습니다!");
			}
			}
			round++;
		}
	}

}
