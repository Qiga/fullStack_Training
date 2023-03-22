import java.util.Scanner;

public class Ex02_Ex04_산술연산_문제 {
	public static void main(String[] args) {
	
		//백의 자리 아래를 버린 결과를 출력하는 코드를 작성하세요
		
		int num = 456;
		
		int hnum = num/100;
		
		System.out.println("결과 확인 : " + hnum*100);
		
		
		//일의 자리를 1로 바꾸는 코드를 작성하세요
		
		int num2 = 986;
		
		int hnum2 = num2/100; 
		int tnum2 = (num2-hnum2*100)/10;
		
		System.out.println((hnum2*100)+tnum2*10+1);
		
		  // 다른 풀이
		
		System.out.println((num2/10)*10+1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int iJava = sc.nextInt();
		
		System.out.print("WEB 점수 입력 : ");
		int iWeb = sc.nextInt();
		
		System.out.print("ANDROID 점수 입력 : ");
		int iANDROID = sc.nextInt();
		
		System.out.println("합계 : " + (iJava+iWeb+iANDROID));
		System.out.printf("평균 : " + String.format("%.2f", (iJava+iWeb+iANDROID)/3.0));
		System.out.printf("평균 : %.2f", (iJava+iWeb+iANDROID)/3.0);
		
		// %전체자리(무한인 경우는'').소수점아래자리(표현을원하는정도)f 
		System.out.printf("%3.2f\n", 0.115);
		
		//초를 입력하면 시/분/초로 출력하세요.
		System.out.println("초를 입력하세요 : ");
		int time = sc.nextInt();
		int c = (time-(time/3600)*3600)/60;
		
		System.out.printf("%d시 %d분 %d초", time/3600, (time-(time/3600)*3600)/60, (time-((time/3600)*3600)-(c*60)));
}
}
