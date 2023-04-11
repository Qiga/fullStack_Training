import java.util.LinkedList;
import java.util.Queue;

public class Ex03큐 {

	public static void main(String[] args) {
		
		// 큐 선언하기 //메모리 공간의 효율적 활용을 위해 LinkedList를 활용함 
		 Queue<Integer> q = new LinkedList<Integer>();
		 
		 //2. 큐에 요소 삽입 //add: 공간 없으면 오류 발생
		 			     // offer : 공간이 없으면 false리턴
		 q.add(1);
		 q.add(2);
		 q.add(3);

		 //3. 가장 먼저 나갈 데이터 반환 (확인만) //peek : 비어있으면 null 반환
		System.out.println(q.peek());
		
		//4. 요소 삭제 (삭제한 값 반환) 			//remove : 비어있으면 오류 발생
											// poll : 비어있으면 null 리턴
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		
		// 큐의 활용
		// 통신(데이터 전송), 프린터 출력, 
		// 운영체제의 테스크 스케줄링 : 선입선출 처리 스케줄링 정책 사용
	}

}
