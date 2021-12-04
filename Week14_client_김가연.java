import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Week14_client_김가연 {
	public static void main(String[] args) {
		Socket socket = null; // 소켓을 생성합니다.
		
		try {
			socket = new Socket("192.168.56.1",9000); // 서버의 IP주소와 포트번호로 소켓을 연결합니다.
			
			Scanner in = new Scanner(socket.getInputStream()); // 서버로부터 받는 스캐너
			Scanner sc = new Scanner(System.in); // 표준입력 스캐너
			PrintWriter out = new PrintWriter(socket.getOutputStream()); // 서버로 나가는 라이터
			int cal[] = new int[100]; // 나중에 쓰일 배열입니다.
			// 이름 선언
			System.out.println("===================");
		    System.out.println("전공 : 사이버보안전공");
			System.out.println("학번 : 2071060");
		    System.out.println("성명 : 김가연");
		    System.out.println("===================\n");
			// 1.
			out.println("Hello?"); out.flush(); // 서버로 인사를 보냅니다.
			
			String strIn = in.nextLine(); // 서버로부터 멘트를 받아와서
			System.out.println(strIn); // 출력합니다.
			
			String num = sc.nextLine(); // 표준입력 스캐너로 숫자를 받습니다.
			int cNum = Integer.parseInt(num); // 이 숫자는 스트링으로 인식되므로 정수로 형변환 해줍니다.
			out.println(num); // 서버로 숫자를 보냅니다.
			out.flush(); // 버퍼를 비워주는 과정입니다.
			
			String strIn2 = in.nextLine(); // 서버로부터 멘트를 받습니다.
			System.out.println(strIn2); // 콘솔에 찍어줍니다.
			
			for(int i = 0;i<cNum;i++) { // 반복문을 통해 원하는 숫자 개수만큼 수를 서버로 보냅니다.
				String objNumStiring = sc.nextLine();
				cal[i] = Integer.parseInt(objNumStiring);
				out.println(cal[i]);
				out.flush();
			}
			// 마지막 멘트를 받아오고 콘솔에 찍어줍니다.
			String strIn3 = in.nextLine();
			System.out.println(strIn3);
			String strIn4 = in.nextLine();
			System.out.println(strIn4);
		} 
		catch(Exception e) { // 오류가 발생하면 오류 메시지를 출력합니다.
			System.out.println(e.getMessage());
		}
		finally { // 코드가 끝나면 소켓을 닫습니다.
			try {
				socket.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

	}

}
