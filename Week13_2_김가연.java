import javax.swing.JOptionPane; // �ڹ� ������ ���� �ɼ����ο��� ���� �޽��ϴ�.

class SharedArea{ // ������ ���� ������ �������ݴϴ�.
	boolean stop;
	String temp;
}

class MyThread extends Thread{
	SharedArea sharedArea; // ���� �����忡�� ���������� ����մϴ�.
    int count=0;
    
	public void setStop(boolean stop) {
		sharedArea.stop = stop; // ���ڷ� ���� ���� ���� ���� ������ ���ڸ� �ٲ��ݴϴ�.
	}
	// �ܾ� ����Դϴ�.
	String[] strArr = new String[] {"cat", "dog", "java", "love", "cake", "happy","giant", "apple", "school","rock","skz","chirstmas","action","cyber","security"};
	
	public void run() {		
		for(int i =20; i>0; i--) { //20�� ���� �����մϴ�.
			if(sharedArea.stop==true) break; // ���������� stop ������ true��� for���� ���������ϴ�.
			int randomValue = (int)(Math.random()*15); // �������� �ܾ ����ݴϴ�.
			sharedArea.temp = strArr[randomValue];
			System.out.println(sharedArea.temp);
			try {
				count++; // ī��Ʈ ���� �÷��ݴϴ�.
				sleep(1000); //1�ʸ��� �ܾ �ϳ��� ���ɴϴ�.
			}
			catch(InterruptedException e) { // ���� ����
				System.out.println(e.getMessage());
			}
		}
		if(count == 20) { // ���� 20�� ���� �������� ���ϸ�
			System.out.println("����!"); // ���и� ����ϰ�
			System.exit(0); // ���α׷��� ���������մϴ�.
		}
		else { // �ƴ϶��
			System.out.println("����!"); // ������ ����ϰ�
			System.out.println("Timer is stopped."); 
			System.exit(0); // ���α׷��� ���������մϴ�.
		}
	}
}

public class Week13_2_�谡�� {
	public static void main(String[] args) {
		// �̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");

		MyThread th = new MyThread(); // �����带 �����
		SharedArea SH = new SharedArea(); // ���������� ����ϴ�.
		
	    th.sharedArea = SH; // ������ ���������� �����忡�� Ȱ���մϴ�.
	    
		th.start();
		
		while(true){
			String st = JOptionPane.showInputDialog("���ڿ� �Է�"); // �ɼ� ������ ���ϴ�.
			System.out.println("<"+st+">�� �Է��ϼ̽��ϴ�.");
			if(st.equals(SH.temp)) { // ���� ���������� temp�� ����ڰ� �Է��� st�� ������
				th.setStop(true); // setStop�� ���ڷ� true�� �Ѱ��ݴϴ�.
			}
		}
	}
}
