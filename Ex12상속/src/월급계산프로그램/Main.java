package 월급계산프로그램;

public class Main {
	
	public static void main(String[] args) {
		TempEmployee te = new TempEmployee("SMHRD002", "박문수", 3000);
		RegularEmployee re = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003", "임성훈", 10, 10);
		
		System.out.println(te.print());
		System.out.println(re.print());
		System.out.println(pe.print());
		
	
	}

}
