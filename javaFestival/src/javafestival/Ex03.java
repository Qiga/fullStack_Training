package javafestival;

public class Ex03 {
	public static void main(String[] args) {

		/*
		 * 1-2+3-4+…+99-100 를 계산하여 답을 출력하시오.
		 * 
		 */
		
		int n = 1;
		int sum = 0;
		
		//100이하까지 반복하는 반복문 생성
		
		while (n<=100) {
			// 짝수인 경우에는 -부호를 붙여서 sum에 더해줘야함 (즉, 뺄셈과 같음) 
			if (n%2==0) {
				sum -= n;
				System.out.print(" -"+n);
				
			}else {
				sum += n;
				System.out.print(" "+n);
			};
			n++;
		}
		System.out.println("\n 결과 : " + sum);
	}
}
