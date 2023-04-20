package 채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//다른 사용자들이 작성한 채팅 받는 기능
public class ListeningThread extends Thread {

private Socket socket = null;; //서버 소켓 정보 저장
	
	Scanner sc = new Scanner(System.in);
	
	public ListeningThread(Socket socket) { //socket : 실제 서버 소켓 정보
		this.socket = socket;
	}
	
	//쓰레드 수행할 한가지 작업
	public void run() { //서버로부터 다른사람이 입력한 채팅 가져오기
		
		//데이터를 받는 클라이언트의 입장 => InputStream을 사용해야함
		//서버로부터 데이터를 받는 통로
		//exception type : 런타임 오류 발생 경고
		// -> 없거나 잘못된 소켓정보가 넘어왔을 때 데이터 이전이 불가능해지기때문
		try {
			InputStream input = socket.getInputStream();
			
			//통로를 통해서 읽을 수 있는 기능이 필요함-> Reader
			//IntputStreamReader로는 데이터를 순서대로 가져 올 수 없음 -> Buffer필요
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			while(true) {
				//버퍼에 저장된 값을 모두 가져올때까지 수행
				//(버퍼의 데이터를 읽어오는 기능)을 출력
				System.out.println(reader.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
