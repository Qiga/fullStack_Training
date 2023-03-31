package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		//main메소드의 코드는 건드리지 말 것.
		
		//1. num2가 num1의 약수인지 아닌지 확인하는 메소드, 약수면 true 아니면 false 반환
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		
		//2. "(주어진수)의 약수 : ~"의 형태로 출력하기 
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		
		//약수의 합 구해오기
		int num = 6;
		int result = getSumOfDivisors(num);
		
		System.out.println(num + "의 약수의 합 : " + result);
		
		//완전수 확인하기
		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2); //(true/false)
		
		//2부터 1000까지의 완전수 구해서 출력하기
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
	}

	//1. num2가 num1의 약수인지 아닌지 확인하는 메소드, 약수면 true 아니면 false 반환
	public static boolean isDivisor(int a, int b) {
			if(a%b==0) {
				return true;
			}else return false;
			//is라는 키워드가 붙은 메서드는 결과값이 (리턴타입이) boolean타입이다. 'is'Divisor
	}

	//2. "(주어진수)의 약수 : ~"의 형태로 출력하기 
	//2. 약수를 구하는 getDivisor()메소드 구현 
	public static void getDivisor(int a) {
		String di = "";
		for (int i=1; i<=a; i++) {
			if (isDivisor(a, i)) {
				di = di + i + " ";
			}
		}
		System.out.printf("%d의 약수 : %s \n", a, di);
	}

	//3.약수의 합 구해오기
	public static int getSumOfDivisors(int a) {
		int sum = 0;
		for (int i=1; i<=a/2; i++) {
			if (isDivisor(a, i)) {
				sum += i;
			}
		}
		return sum+a;
	}

	//4. 완전수인지 아닌지 판단해주는 isPerfectNumber() 를 통해 t/f출력하기
	//완전수 : 자기 자신을 제외한 약수의 합이 자기자신과 같은 수 
	public static boolean isPerfectNumber(int a) {
		return getSumOfDivisors(a)-a == a;
	}
	
	//5. 주어진 숫자 사이의 완전수 모두 출력하기
	public static void getPerfectNumber(int a, int b) {
		String c = "";
		for (int i = a; i<=b; i++) {
			if(isPerfectNumber(i) == true) {
				c += " "+i;
			}else ;
		}
		System.out.print(a+"~"+b+"까지의 완전수 : " + c);
	}
}
