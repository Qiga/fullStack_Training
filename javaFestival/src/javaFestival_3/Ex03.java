package javaFestival_3;

public class Ex03 {

	public static void main(String[] args) {
//		
//		num1, num2, op (+, -, *, /) 를 매개변수로 받아 num1
//		과 num2를 op에 맞게 연산한 결과값을
//		반환해주는 cal 메소드를 작성하세요.

		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1,num2,op));
	}
	
	public static int cal(int a, int b, char c) {
		int answer = 0;
		switch(c) {
		case '*':  answer = a*b;
				break;
		case '+': answer = a+b;
				break;
		case '-': answer = a-b;
				break;
		case '/': answer = a/b;
				break;
		}
		return answer;
	}
}
