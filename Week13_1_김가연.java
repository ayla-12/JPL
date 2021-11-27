import java.util.Scanner; // ��ĳ�� ����� ���� import��
import java.lang.Thread; // ������� ���� �ڵ� import���� �����ϱ� ����!

class SharedArea{  // �������� �־��� sharedarea
	double ratio;
	boolean isReady; 
}

class SimulThread extends Thread{
	SharedArea sharedArea; // Shared Area�� ���� ������ ��ȯ�� �� �� �ֵ��� �մϴ�.
	double rat;
	int num;
	SimulThread(int num){
		this.num = num; // num�� ���ڷ� �޴� ������
	}
	public void run() {
		int count = 0;
		for(int i = 0; i < num; i++) { //num�� ���ڿ� ���� �Ʒ��� ���, �ݺ��մϴ�.
			if((Math.round(Math.random()*100)/100.0)>0.5) {
				count++; // ���� ���� �ѹ��� 0.5 �̻��̶�� ī��Ʈ ���� �ø��ϴ�.
			}
		}
		rat = (double)count / (double)num; // ī��Ʈ�� num���� ���� ������ ����մϴ�.
		sharedArea.ratio = rat; // ���� ������ ������ �ֽ��ϴ�.
		sharedArea.isReady = true; // ���� �غ� �Ǿ����ϴ�.
		synchronized(sharedArea) {
			sharedArea.notifyAll(); // �غ� �Ǿ��ٴ� ��ũ�� ��ȣ�� �����ϴ�.
		}
	}	
}
class PrintThread extends Thread{
	SharedArea sharedArea; // ���� ������ ���� ������ ��ȯ�� �� �� �ֵ��� �մϴ�.
	public void run() {
		if(sharedArea.isReady!=true) { // ���� �غ� �ȵǾ��ٸ�
			try {
				synchronized(sharedArea) {
					sharedArea.wait(); // ��ٸ��ϴ�.
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage()); // ���� ��� �� ���ݴϴ�.
			}
		}
		System.out.printf("Front Ratio: %.2f%%",sharedArea.ratio*100); // �غ� �Ǿ��ִٰ� ���� ������ �ִ� isReady�� true��, notify�� �޾Ҵٸ� ���� ����մϴ�.
	}
}

public class Week13_1_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Input the number of coin toss:");
	    int num = sc.nextInt(); // ��ĳ�ʸ� ���� �󸶳� ������� ���� �޽��ϴ�.
	    
	    SimulThread th1 = new SimulThread(num); //�ùķ����� �������
	    PrintThread th2 = new PrintThread(); // ����Ʈ �����带 ������ݴϴ�.
	    
	    SharedArea SH = new SharedArea();  //���������� ����ϴ�.
	    
	    th1.sharedArea = SH; // ������ ������ ���� ������ th1���� ����մϴ�.
	    th2.sharedArea = SH; // ���� �����ϴ�.
	    
	    th1.start();
	    th2.start();
	    
	}

}

