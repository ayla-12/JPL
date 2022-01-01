import java.io.*; // io ��Ű���� ����ϱ� ���� ����Ʈ��
import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��

public class Week9_1_�谡�� {
	public static void main(String[] args) {
		//�̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
		Scanner sc = new Scanner(System.in); // ��ĳ�ʸ� ����ϱ� ���� ��ĳ�� ��ü ����
		System.out.println("File name for input:");
		String fileName = sc.next(); // �о�� ���� �̸��� ��ĳ�ʷ� �޾ƿɴϴ�.
		sc.nextLine(); // ���Ͱ� �������� �� ������ ���۸� ����ݴϴ�.
		System.out.println("File name for output:");  
		String outputFileName = sc.next(); // ��� ���� ������ ���� �̸��� ��ĳ�ʷ� �޾ƿɴϴ�.
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)); // �Է� ��Ʈ���� �����մϴ�.
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFileName)); // ��� ��Ʈ���� �����մϴ�.
			System.out.println("The numbers in File, "+fileName);
			try {
				while(true) {
					int anInteger = inputStream.readInt(); // �Է� ��Ʈ���� ���� ���� �о����,
					outputStream .writeInt(anInteger*2); // �о�� ���� ��½�Ʈ���� ���� ��� ���Ͽ� ���ϴ�.
					System.out.println(anInteger); //�ֿܼ� ��µ� ���ݴϴ�.
				}
			}
			catch(EOFException e) { //�� �о����� ���� ������ ����˴ϴ�.
				System.out.println("End of reading from file, "+fileName); // ���Ͽ� �ִ� ������ ��� �о�Դٴ� ���Դϴ�.
			}
			inputStream.close(); // �Է� ��Ʈ���� �ݾ��ݴϴ�.
			outputStream.close(); // ��� ��Ʈ���� �ݾ��ݴϴ�.
			System.out.println(outputFileName +" is generated.\n");
		}
		catch(FileNotFoundException e) { // ������ ã�� �� ������ ���� ����ó���� ����˴ϴ�.
			System.out.println("Cannot find file "+fileName);
		}
		catch(IOException e) { // ���Ͽ� ������ ������ ���� ����ó���� ����˴ϴ�.
			System.out.println("Problem with input from file "+fileName);
		}
		
		try {
			System.out.println("The numbers in new File, "+ outputFileName); // ���� ������ ������ �ҷ��ɴϴ�.
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFileName)); // ���ο� �Է� ��Ʈ���� ������ݴϴ�.
			try {
				while(true) {
					int anInteger = inputStream.readInt(); // �Է� ��Ʈ���� ���� �ȿ� �ִ� ���� �ҷ��ɴϴ�.
					System.out.println(anInteger); // �ֿܼ� ��µ� ���ݴϴ�.
				}
			}
			catch(EOFException e) { // �� �о����� ���� ����ó���� �߻��մϴ�.
				System.out.println("End of reading from 2nd file, "+ outputFileName);
			}
			inputStream.close(); // �Է½�Ʈ���� �ݾ��ݴϴ�.
		}
		catch(FileNotFoundException e) { // ������ ã�� �� ������ ���� ����ó���� ����˴ϴ�.
			System.out.println("Cannot find file "+fileName);
		}
		catch(IOException e) { // ���Ͽ� ������ ������ ���� ����ó���� ����˴ϴ�.
			System.out.println("Problem with input from file "+fileName);
		}
	}
}
