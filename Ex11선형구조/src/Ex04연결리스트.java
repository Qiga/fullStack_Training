import java.util.LinkedList;

public class Ex04연결리스트 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		//단일, 단방향리스트
		
		list.addFirst(1);  //가장 앞에 데이터 추가  0
		
		list.addLast(2);  //가장 뒤에 데이터 추가   1
		
		list.add(1, 5); //1번 인덱스에 5를 부여
		
		
		for(Integer i : list) {
			System.out.println(i);
		}
		//데이터 가져오기
		System.out.println(list.get(1));
		
		list.removeFirst() ; //가장 앞의 데이터 삭제
		list.removeLast() ;  //가장 뒤의 데이터 삭제 
		list.remove(0); //0번 인덱스 데이터 삭제
		list.remove();  //기본값 0번 인데스 데이터 삭제
		
		list.clear(); //모든 값 제거
		
		System.out.println(list.size()); // 요소개수 파악하기
		
	}

}
