import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Week14_client_�谡�� {
	public static void main(String[] args) {
		Socket socket = null; // ������ �����մϴ�.
		
		try {
			socket = new Socket("192.168.56.1",9000); // ������ IP�ּҿ� ��Ʈ��ȣ�� ������ �����մϴ�.
			
			Scanner in = new Scanner(socket.getInputStream()); // �����κ��� �޴� ��ĳ��
			Scanner sc = new Scanner(System.in); // ǥ���Է� ��ĳ��
			PrintWriter out = new PrintWriter(socket.getOutputStream()); // ������ ������ ������
			int cal[] = new int[100]; // ���߿� ���� �迭�Դϴ�.
			// �̸� ����
			System.out.println("===================");
		    System.out.println("���� : ���̹���������");
			System.out.println("�й� : 2071060");
		    System.out.println("���� : �谡��");
		    System.out.println("===================\n");
			// 1.
			out.println("Hello?"); out.flush(); // ������ �λ縦 �����ϴ�.
			
			String strIn = in.nextLine(); // �����κ��� ��Ʈ�� �޾ƿͼ�
			System.out.println(strIn); // ����մϴ�.
			
			String num = sc.nextLine(); // ǥ���Է� ��ĳ�ʷ� ���ڸ� �޽��ϴ�.
			int cNum = Integer.parseInt(num); // �� ���ڴ� ��Ʈ������ �νĵǹǷ� ������ ����ȯ ���ݴϴ�.
			out.println(num); // ������ ���ڸ� �����ϴ�.
			out.flush(); // ���۸� ����ִ� �����Դϴ�.
			
			String strIn2 = in.nextLine(); // �����κ��� ��Ʈ�� �޽��ϴ�.
			System.out.println(strIn2); // �ֿܼ� ����ݴϴ�.
			
			for(int i = 0;i<cNum;i++) { // �ݺ����� ���� ���ϴ� ���� ������ŭ ���� ������ �����ϴ�.
				String objNumStiring = sc.nextLine();
				cal[i] = Integer.parseInt(objNumStiring);
				out.println(cal[i]);
				out.flush();
			}
			// ������ ��Ʈ�� �޾ƿ��� �ֿܼ� ����ݴϴ�.
			String strIn3 = in.nextLine();
			System.out.println(strIn3);
			String strIn4 = in.nextLine();
			System.out.println(strIn4);
		} 
		catch(Exception e) { // ������ �߻��ϸ� ���� �޽����� ����մϴ�.
			System.out.println(e.getMessage());
		}
		finally { // �ڵ尡 ������ ������ �ݽ��ϴ�.
			try {
				socket.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

	}

}
