import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {

	//Controller 역할 : 비즈니스 로직
	// -View로부터 데이터를 받아서 가공/처리 역할
	// -필요한 경우 모델의 데이터를 가져오거나 수정하는 역할 수행
	// -View에 결과를 전달하는 역할
	
	//곡 5개를 저장하는 ArrayList 생성
	
	ArrayList<Model> musicList = new ArrayList<Model>(5);
	
	//노래를 재생 / 정지할 수 있는 기능을 가진 객체 생성 -> player.jar (MP3Player 활용)
	MP3Player mp3 = new MP3Player();
	
	//musicList에 있는 노래 순서를 관리할 수 있는 변수 생성
	int index = 0; //전역변수 : 모든 메소드가 공유해야함
	
	//생성자 만들기
	public Controller() {
		//Controller가 생성되면 음악을 미리 세팅 ! -> 바로 재생 가능하도록
		//Model 객체 생성 
		// / : 폴더안에 들어감
		musicList.add(new Model("attention", "뉴진스", 30, "music/attention.mp3"));
		musicList.add(new Model("cookie", "뉴진스", 50, "music/cookie.mp3"));
		musicList.add(new Model("ditto", "뉴진스", 100, "music/ditto.mp3"));
		musicList.add(new Model("hypeboy", "뉴진스", 120, "music/hypeboy.mp3"));
		musicList.add(new Model("OMG", "뉴진스", 118, "music/OMG.mp3"));
	}
	
	
	//재생
	public void play() {
		
		//현재 재생중인 음악이 있는지 확인
		if(mp3.isPlaying()) {
			mp3.stop(); //현재 재생중인 음악 정지
		}
		//index가 가리키고 있는 위치에 음악을 재생
		mp3.play(musicList.get(index).getMusicPath());
	}
	
	// 정지
	public void stop() {
		mp3.stop(); //현재 음악 재생 정지
	}
	
	// 다음곡
	public void next() {
		index++;
		if(index==musicList.size()) {
			index = 0;
		}
		play();
	}
	
	// 이전곡
	
	public void pre() {
		index--;
		if(index==-1) {
			index=musicList.size()-1;
		}
		play();
	}
	
	public void show() {
		
		System.out.println(musicList.get(index).getSongName() + " - "
				+ musicList.get(index).getSinger());
	}
}
