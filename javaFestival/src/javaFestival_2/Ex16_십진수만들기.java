package javaFestival_2;

public class Ex16_십진수만들기 {

	public static void main(String[] args) {
		//문자열 형태의 2진수를 입력받아
//		10진수로 바꾸는 프로그램을 작성하시오
		
		String in = "00101000";
		int sum = 0;
		int be =1;
		char[] dan = new char[in.length()];
		
		for (int i=0; i<in.length(); i++) {
			dan[i] = in.charAt(i);
			if(dan[i]==49) {
				for(int j=1; j<dan.length-i; j++) {
					be *= 2 ;
				}
				sum += be;
				be =1;
			}else;
		}
//		for (int i=0; i<dan.length; i++) {
//			if(dan[i]==49) {
//				for(int j=1; j<dan.length-i; j++) {
//					be *= 2 ;
//				}
//				sum += be;
//				be =1;
//			}else;
//		}
//		
		System.out.println(sum);
	}

}
