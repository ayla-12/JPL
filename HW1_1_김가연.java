import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��
class Time{ // Time Ŭ���� ����
	// ��� ���� ����
	private int hour = 0;
	private int minute = 0;
	// �޼��� ����
	private boolean isVaild(int hour, int minute) { // �ð��� ���� ���ڷ� �޾Ƽ� �´� ������ Ȯ���ϴ� �޼���
		if(hour>=0 && hour<=23 && minute >=0 && minute <=59) // ���� �ȿ� ���ϸ�
		return true; // true�� ��ȯ�մϴ�.
		else return false; // ���� ���̶�� false�� ��ȯ�մϴ�.
	}
	void setTime(int hour, int minute) { // ����ڷκ��� �ð��� �޾� Ŭ���� �� �ν��Ͻ��� ���� �ִ� �޼���
		if(isVaild(hour,minute)) { // ���� ��ȿ�� ���̶�� �Ǵ��ϸ�,
			this.hour = hour; // Ŭ���� ���� ������ �ð���
			this.minute = minute; // ���� �ֽ��ϴ�.
		}
		else { // ���� true���� ���� �ʾҴٸ�,
			System.out.println("Wrong Input"); // �����ȿ� ���� ���� �ƴϹǷ� ���� ������ ������ݴϴ�.
		}
	}
	int getTime(char ch) { // �Ѱܹ��� ������ ���ĺ��� ���� ��µǴ� ��Ҹ� �޸� �� �� �ִ� �޼���
		if(ch == 'h' || ch == 'H') { // h�� H�� �Ѱ� ������
			return hour; // �ð��� �����մϴ�.
		}
		else if(ch == 'm' || ch =='M') { // ���� m�̳� M�� �Ѱ� ������
			return minute; // ���� �����մϴ�.
		}
		else return 0; // �ٸ� ���ڰ� ���´ٸ� 0�� �����մϴ�.
	}
	

}

public class HW1_1_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
		
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ������ �����մϴ�.
		Time t1 = new Time(); // Time Ŭ���� ����
		
		int hour, minute; // �Է��� �ޱ� ���� ���� ���� ����
		
		System.out.println("Hour:"); 
		hour = sc.nextInt(); // ����ڷκ��� �ð��� �޾� hour�� �����մϴ�.
		
		System.out.println("Minute:");
		minute = sc.nextInt(); // ����ڷκ��� ���� �޾� minute�� �����մϴ�.
		
		t1.setTime(hour, minute); // �Է¹��� ���� Ŭ������ �޼��� ���ڷ� �ѱ�ϴ�.
		System.out.printf("%d:%d",t1.getTime('h'),t1.getTime('m')); // ��Ŀ� ���� �޼���κ��� ���ϵ� ���� ����մϴ�.
	
		sc.close(); // ��ĳ�� ����� �������� �ݾ��ݴϴ�.
	}

}
