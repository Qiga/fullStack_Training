package 쓰레드활용;

//동시에 여러 스킬 사용 불가능
//사용한 스킬이 완료되기까지 다른 스킬 사용 불가능 -> 단일 쓰레딩
public class Blitzcrank {

	private String skill;
	
	public Blitzcrank(String key) {
		this.skill = key;
	}
 
	//쓰레드를 오버라이딩 한 것이 아닌 메서드임
	public void run() {
		System.out.println("입력 키 : " + skill);
		
		for(int i=1; i<=3; i++) {
			System.out.println(skill + "사용중 : " + i + "s");
		}
		
		System.out.println(skill + " 스킬 사용 종료");
	}
	
}
