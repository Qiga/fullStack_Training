package 성적관리프로그램;

public class Student {
// 필드 //private는 접근하기가 어려워짐 -> 생성자 활용
	private String name;
	private String stunum;
	private int javaScore;
	private int dbScore;
	private int webScore; 
	
	//생성자 정의
	//객체를 생성할 때 최초 한번만 호출되는 메소드
	//반환타입 작성 x -> void x
	//클래스 이름과 완전히 동일해야만 한다.
	//생성자는 하나 이상 선언되어야 하며 없는 경우 default자동 생성
	public Student(String name, String stunum, 
					int javaScore, int dbScore, int webScore ) {
		this.name = name;
		this.stunum = stunum;
		if(javaScore >= 0 && javaScore <= 100) {
			this.javaScore = javaScore;
		}
		this.dbScore = validScore(dbScore);
		this.webScore = validScore(webScore);
	}
	
	private int validScore(int score) {
		if (score>=0 && score<=100) {
			return score;
		}else {
			return 0;
		}
	}
	

	public int getDbScore() {
		return dbScore;
	}

	public int getWebScore() {
		return webScore;
	}

	public String getStuName() {
		return name;
	}
	public String getStuNum() {
		return stunum;
	}
	public int getjavaScore() {
		return javaScore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStunum(String stunum) {
		this.stunum = stunum;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}

	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
}
