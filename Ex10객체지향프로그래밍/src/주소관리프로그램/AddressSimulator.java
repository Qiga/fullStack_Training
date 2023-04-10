package 주소관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int turn =0;
		String name;
		int age;
		String phone;
		ArrayList<Address> adarr = new ArrayList<>();
		
		while(turn==0) {
		System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
		switch(sc.nextInt()) {
		case 1: 
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("나이 : ");
			age = sc.nextInt();
			System.out.print("전화번호 : ");
			phone = sc.next();
			adarr.add(new Address(name, age, phone));
			System.out.println("추가되었습니다.");
			break;
		case 2: 
			if (adarr.size()==0) {
				System.out.println("등록된 연락처가 없습니다.");
			}else {
			for(int i =0; i<adarr.size(); i++) {				
				Address temp = adarr.get(i);
				System.out.println(i+1+ " "+ temp.getName()+"("+ temp.getAge() + ")" + " : " + temp.getPhone());
			}
			}
			break;
		case 3: 
			if (adarr.size()==0) {
				System.out.println("등록된 연락처가 없습니다.");
			}else {
			for(int i =0; i<adarr.size(); i++) {				
				Address temp = adarr.get(i);
				System.out.println(i+1+ " "+ temp.getName()+"("+ temp.getAge() + ")" + " : " + temp.getPhone());
			}
			
			System.out.print("\n 삭제할 번호 입력 : ");
			adarr.remove(sc.nextInt()-1);
			}
			break;
		case 4:
			System.out.println("검색할 이름 입력 : ");
			String findName = sc.next();
			for (int i=0; i<adarr.size(); i++) {
				if(findName.equals(adarr.get(i).getName())) {
					System.out.println(i+1+ " "+ adarr.get(i).getName()+"("+ adarr.get(i).getAge() + ")" + " : " + adarr.get(i).getPhone());
					break;
				}else if (i==adarr.size()-1){
					System.out.println("검색한 이름의 정보가 없습니다.");
				}
			}
			break;
		case 5: System.out.println("종료합니다");
				turn = 1;
				break;
		}
	}

	}
}
