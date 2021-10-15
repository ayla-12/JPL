import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��

class Shape{ // ���� Ŭ���� ����
	private int x; // ��� ���� ����
	private int y;
	Scanner sc = new Scanner(System.in); // Ŭ���� ������ ����� ��ĳ�� ����
	// �޼��� ����
	void setPoint() { // point�� �Է¹޾� �ν��Ͻ� �����ȿ� �־��ִ� �޼���
		System.out.print("x = ");
		x = sc.nextInt();
		System.out.print("y = ");
		y = sc.nextInt();
	}
	void display() { // ����Ʈ�� ����ϴ� �޼���
		System.out.println("Point (x,y) = ("+x+","+y+")");
	}
}
class Circle extends Shape{ // ��� Ŭ������ ��ӹ޾� �� Ŭ������ ����ϴ�.
	private int radius; // �߰� ��� ���� ����
	// �޼��� ����
	void setPoint() { // point�� �������� �Է¹޴� �޼���
		super.setPoint(); // super�� �̿��ؼ� shape�� �ڵ带 ��Ȱ���մϴ�.
		System.out.print("r = "); // ������ ��Ҹ� �Է¹޽��ϴ�.
		radius = sc.nextInt(); // �������̵�
		return;
	}
	void display() { // display�޼��带 �������̵� �մϴ�.
		super.display(); // point�� ���� �Ӹ� �ƴ϶�
		System.out.println("Radius r = "+radius); // ������ ������ �Բ� ������ݴϴ�.
 		return;
	}
}
class Rectangle extends Shape{ // ��� Ŭ������ ��ӹ޾� ���簢�� Ŭ������ ���줤��.
	private int width; // �߰� ��� ���� ����
	private int height;
	
	void setPoint() { // setPoint �޼��带 �������̵� �մϴ�.
		super.setPoint(); // super�� ���� ��ġ�� �ڵ带 ��Ȱ���մϴ�.
		System.out.print("w = "); // �غ��� ���̸� �޾��ݴϴ�.
		width = sc.nextInt();
		System.out.print("h = "); // ������ ���̸� �޾��ݴϴ�.
		height = sc.nextInt();
		return;
	}
	void display() { // display �޼��带 �������̵� �մϴ�.
		super.display(); // point�� ������ ����ϰ�
		System.out.println("Width: "+width+", Height: "+height); // �غ�, ������ ������ ����մϴ�.
		return;
	}
}

public class HW1_4_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���ؼ�  ��ĳ�� Ŭ������ �����մϴ�.
	    Shape[] MyShape = new Shape[10]; // �������� Ȱ���Ͽ� �θ� Ŭ������ shape Ŭ���� �迭�� �����մϴ�.
	    	    
	    for(int i = 0 ; i<10 ; i++) { // �迭�� ĭ�� ���� �� ������ �ݺ����� �����ϴ�.
	    	System.out.println("\n1.Circle   2.Rectangle   3.Show   4.Exit");
		    int sel = sc.nextInt();
	    	if(sel == 4) break; // ���� �������� 4��� ��� �ݺ����� �����մϴ�.
	    	else if(sel == 1) { // �������� 1�̶��
	    		MyShape[i] = new Circle(); // �� Ŭ������ �����մϴ�.
	    		MyShape[i].setPoint(); // �׸��� ������ �����մϴ�.
	    		continue;
	    	}
	    	else if(sel == 2) { // ���� �������� 2���
	    		MyShape[i] = new Rectangle(); // ���簢�� Ŭ������ �����մϴ�.
	    		MyShape[i].setPoint(); // �׸��� ������ �����մϴ�.
	    		continue;
	    	} 
	    	else if(sel == 3) { // �������� 3�̶��
	    		for(int j=0;j<i;j++) { // ���ݱ��� ���� �����͸� ����մϴ�.
	    			MyShape[j].display();
	    		}
	    		--i; // �� �������� ���ϰ� �Ǹ� �迭���� �Էµ��� �ʾұ� ������ i���� 1�� ���ݴϴ�. �̴�� �Ѿ�� null ���� ���� ���߿� ����Ʈ�� ����� �� ������ �߻��մϴ�.
	    		continue;
	    	}
	    	else {
	    		System.out.println("Wrong Input"); // ���� �������� ���� ���� �Է¹޾Ҵٸ� ������ ����մϴ�.
	    	}
	    }
	    sc.close(); // ��ĳ�� ����� �������Ƿ� �ݾ��ݴϴ�.
	}

}
