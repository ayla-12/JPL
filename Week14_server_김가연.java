import java.io.*;
import java.net.*;
import java.util.Scanner;

/*
 * ���� : ���̹���������
 * �̸� : �谡��
 * �й� : 2071060
*/

public class Week14_server_�谡�� {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int sum = 0;
		
		try {
			serverSocket = new ServerSocket(9000); // ���� ������ ����ΰ� ��ٸ��ϴ�
			socket = serverSocket.accept(); // Ŀ�ؼ� ��û�� ��ٸ��ٰ� accept
			
			Scanner in = new Scanner(socket.getInputStream()); // Ŭ���̾�Ʈ�� ��������ִ� ��ĳ��
			PrintWriter out = new PrintWriter(socket.getOutputStream()); // Ŭ���̾�Ʈ�� ��������ִ� ������
			
			String strIn = in.nextLine(); // �Է� ��Ʈ���� ���� Ŭ���̾�Ʈ���� ���� ������ �޾ƿɴϴ�
			System.out.println(strIn); //�޾ƿ� ���� ����մϴ�
			
			out.println("How many numbers?"); // ��� ��Ʈ���� ���� Ŭ���̾�Ʈ�� ��Ʈ�� �����ϴ�
			out.flush(); // ���ۿ� �ִ� ���� ����ִ� �����Դϴ�. ���ϸ� ���۵��� �ʽ��ϴ�.
			
			String numString = in.nextLine(); // Ŭ���̾�Ʈ���� ���� ���ڸ� ��Ʈ������ �����մϴ�.
			System.out.println(numString); // ��Ʈ���� ����ؼ� ����ְ�,
			int cNum = Integer.parseInt(numString); // �� ��Ʈ���� ������ ��ȯ���ݴϴ�.
			
			out.println("Input "+numString+" number"); // Ŭ���̾�Ʈ�� ��Ʈ�� �����ϴ�.
			out.flush(); // ���ۿ� �ִ� ���� �������ϴ�.
			
			for(int i = 0;i<cNum;i++) { // �ݺ����� ������ ���ڸ� �޾��ݴϴ�.
				String objNumString = in.nextLine();
				int objNum = Integer.parseInt(objNumString);
				sum += objNum; // ��Ʈ���� ������ ��ȯ�ؼ� sum�� �����ݴϴ�.
			}
			// sum�� avg�� ����ؼ� Ŭ���̾�Ʈ�� �����ϴ�.
			out.println("Sum: "+sum); out.flush();
			out.println("Avg: "+ (float)sum/(float)cNum); out.flush();
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); // ���� ������ �߻��Ѵٸ� ���� �޽����� ����մϴ�.
		}
		finally { // ������ ������ �ݾ��ְ� ���α׷��� �����մϴ�.
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
