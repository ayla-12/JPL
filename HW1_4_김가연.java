import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��

class Shape{ // ���� Ŭ���� ����
	private int x; // ��� ���� ����
	private int y;
	// �޼��� ����
	void setPoint(int x, int y) { // point�� �Է¹޾� �ν��Ͻ� �����ȿ� �־��ִ� �޼���
		this.x = x;
		this.y = y;
	}
	void display() { // ����Ʈ�� ����ϴ� �޼���
		System.out.println("Point (x,y) = ("+x+","+y+")");
	}
}
class Circle extends Shape{ // ��� Ŭ������ ��ӹ޾� �� Ŭ������ ����ϴ�.
	private int radius; // �߰� ��� ���� ����
	// �޼��� ����
	void setPoint(int x, int y, int r) { // point�� �������� �Է¹޴� �޼���
		super.setPoint(x,y); // super�� �̿��ؼ� shape�� �ڵ带 ��Ȱ���մϴ�.
		this.radius = r;
	}
	void display() { // display�޼��带 �������̵� �մϴ�.
		super.display(); // point�� ���� �Ӹ� �ƴ϶�
		System.out.println("Radius r = "+radius); // ������ ������ �Բ� ������ݴϴ�.
	}
}
class Rectangle extends Shape{ // ��� Ŭ������ ��ӹ޾� ���簢�� Ŭ������ ���줤��.
	private int width; // �߰� ��� ���� ����
	private int height;
	
	void setPoint(int x, int y, int w, int h) { // setPoint �޼��带 �������̵� �մϴ�.
		super.setPoint(x, y); // super�� ���� ��ġ�� �ڵ带 ��Ȱ���մϴ�.
		this.width = w;
		this.height =h;
	}
	void display() { // display �޼��带 �������̵� �մϴ�.
		super.display(); // point�� ������ ����ϰ�
		System.out.println("Width: "+width+", Height: "+height); // �غ�, ������ ������ ����մϴ�.
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
	    int x,y,r,w,h; // ������ �Է¹޾� �����ϴ� ���� �������� �����մϴ�.
	    
	    for(int i = 0 ; i<10 ; i++) { // �迭�� ĭ�� ���� �� ������ �ݺ����� �����ϴ�.
	    	System.out.println("\n1.Circle   2.Rectangle   3.Show   4.Exit");
		    int sel = sc.nextInt();
	    	if(sel == 4) break; // ���� �������� 4��� ��� �ݺ����� �����մϴ�.
	    	else if(sel == 1) { // �������� 1�̶��
	    		Circle c = new Circle(); // �� Ŭ������ �����մϴ�.
	    		System.out.print("x = "); x = sc.nextInt(); // x,y,�������� �Է¹޽��ϴ�.
	    		System.out.print("y = "); y = sc.nextInt();
	    		System.out.print("r = "); r = sc.nextInt();
	    		c.setPoint(x,y,r); // �׸��� ������ �����մϴ�.
	    		MyShape[i] = c; // �迭�� �־��ݴϴ�.
	    		continue;
	    	}
	    	else if(sel == 2) { // ���� �������� 2���
	    		Rectangle rt = new Rectangle(); // ���簢�� Ŭ������ �����մϴ�.
	    		System.out.print("x = "); x = sc.nextInt(); // x,y,����,�غ��� �Է¹޽��ϴ�.
	    		System.out.print("y = "); y = sc.nextInt();
	    		System.out.print("w = "); w = sc.nextInt();
	    		System.out.print("h = "); h = sc.nextInt();
	    		rt.setPoint(x, y, w, h); // �׸��� ������ �����մϴ�.
	    		MyShape[i] = rt;  // �迭�� �־��ݴϴ�.
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
