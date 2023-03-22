
public class Ex01산술연산 {
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 7;
		float num3 = 10f;
		float num4 = 7f;
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		System.out.println(num1/num4);
		System.out.println(num3%num4);
		
		//정수끼리의 연산 = 정수값
		//실수끼리의 연산 = 실수값
		//정수와 실수 연산 = 실수값 
		//실수를 연산하게 되면 부동소수점으로 저장하기 때문에 오차가 발생할 수 있음.
		
		int num5 = 7;
		int num6 = 3;
		
		//더하기
		System.out.println("더한 결과 : " + (num5+num6));
		//빼기
		System.out.println("뺀 결과 : " + (num5-num6));
		//곱하기
		System.out.println("곱한 결과 : " + num5*num6);
		//나누기
		System.out.printf("나눈 결과(몫):%d \n나눈 결과(나머지)%f\n", num5/num6, (double)num5%(double)num6 );
		System.out.printf("나눈 결과 : %f\n", (double)num5/num6 );
		
		System.out.printf("나눈 결과 : %f\n", (1.0*num5)/num6 );
		
		System.out.println("나눈 결과 : " + (double)num5/num6);

		System.out.println("나눈 결과 : " + (double)num5/num6);
	}
}
