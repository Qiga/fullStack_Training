package 채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

//기능
// 1. 사용자가 입력한 채팅 받기
// 2. 받은 채팅 보내주기
public class SocketServer extends Thread{

	private ArrayList<Socket> list = new ArrayList<>(); 
	// 현재까지 연결된 사용자-Socket 저장용

	private Socket socket = null; //현재 채팅을 보내고 받는 사용자 임시 저장공간
	
	//클라이언트의 소켓정보를 넘기면서 해당 클라이언트와 데이터 송수신 가능한 소켓 생성
	public SocketServer(Socket socket) {
		this.socket = socket;
		list.add(socket);
	}
	
	public void run() {
		//클라이언트 접속 시 해당 클라이언트 ip주소 출력
		System.out.println(socket.getInetAddress() +"님이 연결됨");
		
		try {
			//클라이언트가 보낸 메세지 읽어들이는 통로
			InputStream input = socket.getInputStream();
			
			BufferedReader reader= new BufferedReader(new InputStreamReader(input));
			
			//서버가 클라이언트한테 메시지 보내는 통로
			OutputStream output = socket.getOutputStream();
			
			PrintWriter writer = new PrintWriter(output, true);
			
			//서버-> 클라이언트)
			
			writer.println("사용할 닉네임 >> ");
			//클라이언트의 최초 입력값 => 닉네임
			//다음부터 입력한 값은 채팅 내용 -> 다른 사용자에게 출력
			
			String nick = null; //클라이언트가 작성한 닉네임 저장하는 변수
			String readValue; //클라이언트가 입력한 값 저장(닉네임, 채팅)
			boolean check = false; //false - 사용자 닉네임 입력 전

			
			
			while((readValue = reader.readLine())!= null) {
				if(!check) { //닉네임 입력 전
					nick = readValue;
					check = true;
					writer.println(nick + "님이 성공적으로 접속되었습니다.");
				}else { //닉네임 입력 후 
					for(Socket s:list) { //현재 서버와 연결된 모든 클라이언트(Socket) 확인
						//서버와 연결된 모든 클라이언트와 데이터 송수신가능한 스트림을 각각 만듦
						output = s.getOutputStream(); 
						writer = new PrintWriter(output, true);
						//채팅을입력한 클라이언트의 닉네임: 입력한 채팅내용 -> 출력
						writer.println(nick + ":"+ readValue);
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
