import java.io.*;
import java.net.*;
import java.util.Scanner;

/*
 * 전공 : 사이버보안전공
 * 이름 : 김가연
 * 학번 : 2071060
*/

public class Week14_server_김가연 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int sum = 0;
		
		try {
			serverSocket = new ServerSocket(9000); // 서버 소켓을 열어두고 기다립니다
			socket = serverSocket.accept(); // 커넥션 요청을 기다리다가 accept
			
			Scanner in = new Scanner(socket.getInputStream()); // 클라이언트랑 연결시켜주는 스캐너
			PrintWriter out = new PrintWriter(socket.getOutputStream()); // 클라이언트랑 연결시켜주는 라이터
			
			String strIn = in.nextLine(); // 입력 스트림을 통해 클라이언트에서 보낸 문장을 받아옵니다
			System.out.println(strIn); //받아온 것을 출력합니다
			
			out.println("How many numbers?"); // 출력 스트림을 통해 클라이언트로 멘트를 보냅니다
			out.flush(); // 버퍼에 있는 것을 비워주는 과정입니다. 안하면 전송되지 않습니다.
			
			String numString = in.nextLine(); // 클라이언트에서 보낸 숫자를 스트링으로 저장합니다.
			System.out.println(numString); // 스트링을 출력해서 찍어주고,
			int cNum = Integer.parseInt(numString); // 그 스트링을 정수로 변환해줍니다.
			
			out.println("Input "+numString+" number"); // 클라이언트로 멘트를 보냅니다.
			out.flush(); // 버퍼에 있는 것을 내보냅니다.
			
			for(int i = 0;i<cNum;i++) { // 반복문을 돌려서 숫자를 받아줍니다.
				String objNumString = in.nextLine();
				int objNum = Integer.parseInt(objNumString);
				sum += objNum; // 스트링을 정수로 변환해서 sum에 더해줍니다.
			}
			// sum과 avg를 계산해서 클라이언트로 보냅니다.
			out.println("Sum: "+sum); out.flush();
			out.println("Avg: "+ (float)sum/(float)cNum); out.flush();
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); // 만약 오류가 발생한다면 오류 메시지를 출력합니다.
		}
		finally { // 끝나면 소켓을 닫아주고 프로그램을 종료합니다.
			try {
				socket.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			try {
				System.out.println("Service finished.");
				serverSocket.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
