package 채팅프로그램;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//채팅을 작성하고 작성한 채팅을 -> 서버로 보냄
public class WritingThread extends Thread{ //멀티쓰레딩 : 사용자들이 동시에 채팅 가능

	//서버와 연결해주는 소켓이 필요함
	//클라이언트가 채팅을 보낼 서버의 소켓 정보를 저장하는 것(목적지)
	private Socket socket = null;;
	
	Scanner sc = new Scanner(System.in);
	
	public WritingThread(Socket socket) { //socket : 실제 서버 소켓 정보
		this.socket = socket;
	}
	
	//쓰레드 수행할 한가지 작업
	public void run() { //클라이언트가 작성한 채팅을 서버로 보내기
		
		//작성하는 것은 클라이언트의 입장 => outputStream을 사용해야함
		//클라이언트가 작성한 데이터를 서버로 전송하는 통로
		//exception type : 런타임 오류 발생 경고
		// -> 없거나 잘못된 소켓정보가 넘어왔을 때 데이터 이전이 불가능해지기때문
		try {
			OutputStream out = socket.getOutputStream();
			
			//통로를 통해서 데이터(텍스트)를 출력할 때 쓰는 객체
			// new PrintWriter(통로명, autoflush(자동으로 버퍼에 쌓인 데이터를 전송))
			PrintWriter writer = new PrintWriter(out, true);
			
			while(true) {
				//키보드로 입력한 값을 writer을 통해 서버로 내보내게됨
				writer.println(sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
