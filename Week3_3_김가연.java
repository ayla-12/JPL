import java.util.Scanner;


class MyFile {
	//�ν��Ͻ� ���� ����
	String title;
	int page;
	
	//�޼��� ���
	void setTitle(String title) {
		this.title = title;  // ���� ������ �ν��Ͻ� ������ �ֽ��ϴ�.
	} 
	String getTitle() {
		return title; // title�� private �� ���� ����Ͽ� getter�� ������ݴϴ�.
	}
	void setPage(int page) {
		this.page = page; // ���� ������ �ν��Ͻ� ������ �ֽ��ϴ�.
	}
	int getPage() {
		return page; // page�� private �� ���� ����Ͽ� getter�� ������ݴϴ�.
	}
	void fileCopy(MyFile mf) { // �ν��Ͻ� mf�ȿ� ������ �ν��Ͻ� ������ �������ִ� �Լ��Դϴ�.
		mf.title = this.title;
		mf.page = this.page;
	}
	void fileInfo() {
		System.out.println("��������:"+getTitle()); //getter�� ����Ͽ� ��������� ������, �� ���� ������ ������ݴϴ�.
		System.out.println("������:"+getPage());
	}
	
}

public class Week3_3_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		Scanner kbd = new Scanner(System.in);
		String title; // �� �ڵ� 
		int page; 	//������ ��� �� �� �����ϴ�.
		
		MyFile fOld = new MyFile(); //���� file��
		MyFile fNew = new MyFile(); //���� ����� file �ν��Ͻ��� ������ݴϴ�.
		
		System.out.println("--File�����Է� (����,��������)--");
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt()); // ��ĳ�ʷ� �޾��ݴϴ�.
		fOld.fileCopy(fNew); // ���� ī�� ����
		System.out.println("<���� File>");
		fOld.fileInfo();
		System.out.println("<����� File>");
		fNew.fileInfo(); //���� ������ ������ݴϴ�.
	}

}
