
public class Ex01While문 {

	public static void main(String[] args) {

		// 1~5까지 출력하기

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		// ......
		System.out.println(5);

		// 반복문

		// 1.while (do~while) : 특정 조건에 해당할 경우에만 반복 (반복횟수가 정확하지 않은 경우 사용)
		// while({문장}을 반복할 조건)
		int num = 1;

		while (num <= 5) {
			System.out.println(num); // 값이 바뀌어야 하므로 변수를 활용
			num++;
		}

		int num1 = 1;

		while (num1 < 6) {
			System.out.println(num1); // 값이 바뀌어야 하므로 변수를 활용
			num1++;
		}

		int num2 = 0;

		while (true) { // 반복을 그만둘 조건 //무조건 반복만 하게!
			System.out.println(++num2); // 값이 바뀌어야 하므로 변수를 활용
			// 반복문 나갈 조건을 추가해주기
			if (num2 > 4) {
				break; // 반복문 탈출하기 -> break를 기준으로 가장 가까운 반복문'만' 탈출함
			}
		}

		int num3 = 1;

		while (true) { // 반복을 그만둘 조건 //무조건 반복만 하게!

			// 반복문 나갈 조건을 추가해주기
			if (num3 == 6) {
				break; // 반복문 탈출하기 -> break를 기준으로 가장 가까운 반복문'만' 탈출함
			}
			System.out.println(num3++); // 값이 바뀌어야 하므로 변수를 활용
		}
		
		
		//do~while : 반복문장을 무조건 1번은 실행해야할때
		
		int num4 = 1;
		do {
			System.out.println(num4++);
		}while(num4<=5);

		// 2.for
		/*for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		*/
	}

}
