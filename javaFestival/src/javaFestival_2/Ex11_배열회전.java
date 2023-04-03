package javaFestival_2;

import java.util.Arrays;

public class Ex11_배열회전 {

	public static void main(String[] args) {
//		아래와 같은 2차원 배열을 왼쪽으로 90도 회전하여
//		출력하시오
		int n=5;
		
		int[][] base = new int[n][n];
//		final int[][] turn_base = new int[base.length][base.length];
		
		int num = 1;
		//기본 배열 설정
		for (int i=0; i<base.length; i++) {
			for (int e=0; e<base[i].length; e++) {
				base[i][e] = num++;
			}
		}
		//출력
		for(int i =0; i<base.length; i++) {
			System.out.println(Arrays.toString(base[i]));
		}
		
		
		//회전 후 출력 (값 저장x)
		for (int i=base.length-1; i>=0; i--) {
			for (int e=base[i].length-1; e>=0; e--) {
				System.out.print(base[i][e]); 
			}
			System.out.println();
		}
		
		
		//회전 시키기 (값 저장o)
//		for (int i=0; i<base.length; i++) {
//			for (int e=0; e<base[i].length; e++) {
//				turn_base[base.length-1-e][i] = base[i][e];
//			}
//		}
//		
//		//출력
//		for(int i =0; i<turn_base.length; i++) {
//			System.out.println(Arrays.toString(turn_base[i]));
//		}
	

	}

}
