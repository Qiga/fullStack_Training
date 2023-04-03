package javaFestival_2;

public class Ex09_거리비교 {

	public static void main(String[] args) {
//		아래와 같이 숫자가 담긴 1차원 배열이 주어졌을 때,
//		두 개의 숫자를 뽑아 서로의 거리를 비교한 후
//		거리가 가장 작은 숫자의 위치(index)를 출력하시오.
		
		int[] point = {92,32,52,9,81,2,68};
		
		//절대값 메서드 Math.abs => 안되면 if문 활용(메서드 만들기=> abs)
		int range = abs(point[0]-point[1]);
		int start=0;
		int end=0;
		
		for (int i=0; i<point.length-1; i++) {
			for (int e=i+1; e<point.length; e++) {
				if(abs(point[i]-point[e])<range) {
					range = abs(point[i]-point[e]);
					start = i;
					end = e;
				}
			}
		}
		
		System.out.print("result : ["+ start +","+ end +"]");
		
	}

	public static int abs(int a) {
		if (a<0) {
			a = -a;
		}
		return a;
	}
}
