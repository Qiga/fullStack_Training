import java.util.ArrayList;

public class Ex01ArrayList {
	
	public static void main(String[] args) {
		
		// 1. ArrayList 생성 -> heap 영역
		//		-> Array List  생성된 참조값 저장 -> 참조변수(레퍼런스 변수) 선언
		ArrayList<String> al = new ArrayList<String>();
	//ArrayList<E>(크기-생략가능(10))
		
		//2. 요소 삽입
		al.add("Hello"); //ArrayList 의 0번에 삽입
		al.add("Hi"); //ArrayList 의 1번에 삽입
		al.add("Java"); //ArrayList 의 2번에 삽입
		
		//3. 요소 개수 
		System.out.println(al.size()); //3
		
		//4. 요소 중간 삽입 
		al.add(1, "Python" );
		System.out.println(al.size()); //4
		
		//5. 특정 인덱스에 있는 요소 알아내기
		System.out.println(al.get(0));//알고 싶은 인덱스 번호
		
		for (int i = 0; i<4; i++) {
			System.out.println(al.get(i));
		}
		
		 //확장 for문을 활용
		for (String s : al) {
			System.out.println(s);
		}
		
		//6.특정 요소 삭제
		
		String a = al.remove(2);
		System.out.println(al.size());
		
		//7. 모든 요소 사제
		al.clear();
		System.out.println(al.size());
	}
}
