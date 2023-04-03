package javaFestival_2;

import java.util.Scanner;

public class Ex15_점수내기 {

	public static void main(String[] args) {
		// 스마트미디어인재개발원의 인쌤이 Java시험문제를 채점하고 있다.
//		문제마다 ‘o’ 또는 ‘x’로 표시가 되어 있는데 점수를 매기는 방식이 특이하다.
//		‘o’는 점수가 누적되는 방식으로 채점되는데 이전부터 자신을 포함한 연속된
//		‘o’의 개수 만큼의 점수로 채점이 됩니다. 예를 들어 ‘
//		oooxoo’라는 표시가
//		있다면 순서대로 1+2+3+0+1+2=9 으로 총점이 계산됩니다. 학생이 푼 시험지에
//		정답, 오답 여부가 표시되어 있을 때 총점을 구하는 프로그램을 작성하세요


		Scanner sc = new Scanner(System.in);
		int total = 0;
		int con = 0;
		
		System.out.println("====채점하기====");
		String answer = sc.next();
		for(int i=0; i<answer.length(); i++) {
			if (answer.charAt(i)=='o') {
				total += 1+con++;
			}else {
				con = 0;
			}
		}
		
		System.out.println(total);
		sc.close();
		
	}

}
