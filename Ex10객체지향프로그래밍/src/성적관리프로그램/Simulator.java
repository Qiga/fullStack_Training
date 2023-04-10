package 성적관리프로그램;

public class Simulator {

	public static void main(String[] args) {
		성적등급시스템 sy = new 성적등급시스템();
		
		//stu1객체 생성
		Student stu1 = new Student("황해도", "001", 90,80,87);
		//변수명는 stack 영역에 나머지는 heap영역에 저장
		Student stu2 = new Student("강예진","002",100,100,100);

		System.out.println(stu1.getStuName());
		System.out.println(stu1.getStuNum());
		System.out.println(sy.grade(stu1.getjavaScore()));
		//캡슐화의 이점을 살리지 못함. (보안 위험)
//		stu1.name = "황해도";
//		stu1.stuNumber = "001";
//		stu1.dbScore = 80;
//		stu1.javaScore = 90;
//		stu1.webScore = 87;
		stu1.setStunum("002");
		System.out.println(stu1.getStuNum());

	}
}
