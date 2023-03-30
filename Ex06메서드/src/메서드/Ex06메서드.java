package 메서드;

public class Ex06메서드 {
	
	public static void add(int a, int b){
		System.out.println(a+b);
	}
	public static void sub(int a, int b){
		System.out.println(a-b);
	}
	public static void mul(int a, int b){
		System.out.println(a*b);
	}
	public static void div(int a, int b){
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		//main내의 코드를 변경하지 않고 실행시 콘솔창에 8, -2, 15, 0출력
		add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);
		
	}
	
}
