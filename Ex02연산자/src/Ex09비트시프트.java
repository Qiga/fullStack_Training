
public class Ex09비트시프트 {
	public static void main(String[] args) {
		
		//비트 연산자, 시프트 연산자 -> 연산을 바르게 진행
		
		int a = 9;
		System.out.println(a);
		//비트연산 : &, | (and, or), ^, ~
		
		int b = 9; //1001
		int c = 11; //1011
		
		//같은 자리에서 하나라도 0이면 false(0)
		System.out.println(b&c);
		
		//같은 자리에서 하나라도 1이면 true(1)
		System.out.println(b|c);
		
		//같은 자리에서 같으면 false(0), 다르면 true(t)
		System.out.println(b^c);
		
		int d = 6; //0110
		
		System.out.println(~d); //1001
		
		//시프트 연산 : 비트를 빠르게 움직이게 하는 것
		System.out.println(3<<2);
		//3<<2 3의 2진수 값을 왼쪽으로 2칸씩 움직이게 하는것
		// 00000011 > 00001100 > 12(10진수)
		
	}
}
