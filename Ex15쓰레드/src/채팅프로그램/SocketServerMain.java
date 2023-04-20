package 채팅프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerMain {

	public static void main(String[] args) {
		
		int socketPort = 1234; //서버 채팅 포트 설정
		
		try {
			//채팅서버 열기위한 서버open메서드
			ServerSocket serverSocket = new ServerSocket(socketPort);
			
			//서버가 종료될 때 까지 클라이언트가 접속할 경우 해당 정보를 socketserver의 list에 저장함
			while(true) {
				Socket socketUser = serverSocket.accept(); //접속시도하는 클라이언트 받는 메서드
				SocketServer socketServer = new SocketServer(socketUser);
				socketServer.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
