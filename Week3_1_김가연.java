import java.util.Scanner;

class Song {
		//�ν��Ͻ� ����
		String title;
		String singer;
		int price;
		
		
		//�޼���
		void play() {
			System.out.println("�뷡���� : \""+ title + "\" by "+ singer);
		} // Ż�⹮�ڸ� �̿��ؼ� ū����ǥ�� �־��ݴϴ�.
		
		void price() {
			System.out.println(price + "���Դϴ�. ");
		}
	}


public class Week3_1_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		//Ŭ������ �ν��Ͻ� 2���� ��ĳ�� ����� ���� ��ĳ�ʸ� �������ݴϴ�.
		Song s1 = new Song();
		Song s2 = new Song();
		Scanner sc = new Scanner(System.in);
		
		
		//song 1�� ����, ����, ������ ��ĳ�ʸ� �̿��� �޽��ϴ�.
		System.out.println("*Song 1*");
		System.out.print("����Է�:");
		s1.title = sc.nextLine();
		System.out.print("�������Է�:");
		s1.singer = sc.nextLine();
		System.out.print("�����Է�:");
		s1.price = sc.nextInt();
		
		sc.nextLine(); //int�� ������ ���Ͱ� ���ۿ� ���� ������ �� �ڵ带 �̿��� ���͸� �Ծ��ݴϴ�.
		
		//song 2�� ����, ����, ������ ��ĳ�ʸ� �̿��� �޽��ϴ�.		
		System.out.println("\n*Song 2*");
		System.out.print("����Է�:");
		s2.title = sc.nextLine();
		System.out.print("�������Է�:");
		s2.singer = sc.nextLine();
		System.out.print("�����Է�:");
		s2.price = sc.nextInt();
		
		//�뷡 ������ ���� �뷡 ������ �����ͼ� ������ݴϴ�.
		System.out.println("\n�뷡�� ������");
		System.out.println("1:"+s1.title+" 2:"+s2.title);
		
		int select = sc.nextInt();
		
		//select ������ �޾ƿ� ���ڸ� �����ؼ� if������ ����� ������ݴϴ�.
		if(select == 1) {
			s1.play();
			s1.price();
		}
		else {
			s2.play();
			s2.price();
		}
		
		System.out.println("�����մϴ�."); //������ �λ縦 ���ݴϴ�.
		sc.close(); //��ĳ�ʸ� �ݾ��ݴϴ�.
		
	}

}
