import java.util.Scanner;
class Song {
		//�ν��Ͻ� ����
		String title;
		String singer;
		int price;
		
		// ������ 3�� ����
		Song(){	} // default ������ �Դϴ�.
		Song(String title, int price){ // ����� ���ݸ��� �޴� �������Դϴ�.
			this(title, "��", price); // �Ʒ��� �����ڸ� �̿��ϱ� ���� this()�� ����Ͽ� ������ ������ ������ ������ ����մϴ�.
		}
		Song(String title, String singer, int price){ // ����, ����, ������ �޴� �������Դϴ�.
			this.title = title; 
			this.price = price;
			this.singer = singer; 
		} // ����, ����, ������ �޾� Ŭ������ �ν��Ͻ� ������ ����־��ݴϴ�.
		
		//�޼���
		void play() {
			System.out.println(title + " by "+ singer); // �뷡�� ����� �������� ����ִ� �޼����Դϴ�.
		} 
	}

public class Week4_1_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("===================");
	      System.out.println("���� : ���̹���������");
	      System.out.println("�й� : 2071060");
	      System.out.println("���� : �谡��");
	      System.out.println("===================\n");
	      
	      // ���� ������ ����ϱ� ���� ���ο��� �������ݴϴ�.
	      String title; 
		  String singer;
		  int price, time; // time�� ���߿� ���� �� �� ����Ͻðڽ��ϱ�? �� Ȱ��Ǵ� ���� �����Դϴ�.
	      Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ������ �ҷ����ݴϴ�.
	      
	      System.out.println("*Song ����*");
	      while(true) { //while���� ���� ������ �ݺ��մϴ�. 
	    	  System.out.print("���:"); title = sc.nextLine(); // ��ĳ�ʸ� ���� ����� �޽��ϴ�. next()�� ����ϸ� ���Ͱ� �Է��� ���� �����Ƿ� nextLine()�� ����մϴ�.
	    	  if(title=="") { // ���� �Է°��� ���ٸ�
	    		  System.out.println("����� �ݵ�� �ʿ��մϴ�."); // �� ������ ����ϰ� �ٽ� ������ �ݺ��մϴ�.
	    	  }
	    	  else break; // ������ �Է°��� �ִٸ� �״�� break�ؼ� while���� ���� ���ɴϴ�.
	      }
	      System.out.print("������:"); singer = sc.nextLine(); //�������� �޽��ϴ�. �������� �� ��� �����ϴ�.
	      System.out.print("����:"); price = sc.nextInt(); // ������ �޽��ϴ�. ������ �����̹Ƿ� nextInt()�� �޾��ݴϴ�.
	      
	      // ������ �б���
	      if(singer=="") { //���� ������ ���� ���� ���ٸ�,
	    	  Song song = new Song(title, price);  // �̿� ���� ������ ���� �����ڸ� �ҷ����ݴϴ�.
	    	  System.out.println("��� �����ðڽ��ϱ�?"); time = sc.nextInt(); // �׸��� ��� �������� time�� ���� �޾��ݴϴ�.
		      for (int i = 0; i < time; i++) { // time ��ŭ for ���� ���� Ŭ������ �޼����� play()�� �ݺ��մϴ�.
		    	  song.play();
		      }
		      System.out.println("�� "+song.price*time+"���Դϴ�."); // �׸��� time ��ŭ ���ݿ��� ���Ͽ� ���� ������ ����մϴ�.
	      }
	      else { //���� ������ ���� ���� �ִٸ�,
	    	  Song song = new Song(title, singer, price); // �̿� ���� ������ �ִ� �����ڸ� �ҷ����ݴϴ�.
	    	  System.out.println("��� �����ðڽ��ϱ�?"); time = sc.nextInt(); //���� ����� �����ϴ�.
		      for (int i = 0; i < time; i++) {
		    	  song.play();
		      }
		      System.out.println("�� "+song.price*time+"���Դϴ�.");
	      }
	     
	      // if else�� �����ڸ� ���� �ڿ� �Բ� for ���� ������ ���� ȿ�����̶�� ���������� for ���� ������ ���� song.play()�� ����� �� �� ���� �Ǿ� �ݺ��Ǵ� �ڵ带 �ְ� �Ǿ����ϴ�.
	      // �� �κ��� �ذ��ϸ� �� ȿ������ �ڵ尡 �� �� �����ϴ�. ���� �� �����غ��ڽ��ϴ�.
	      
	      sc.close();
	}
}