import java.awt.event.*;
import javax.swing.*; // �ڹ� GUI ����� ���� import��

class MyFrameHw extends JFrame{
	public MyFrameHw() {		
		JPanel defaultPanel = new JPanel(); // �г��� ����ϴ�.
		JButton button = new JButton("Click!"); // ��ư�� �����մϴ�.
		button.addMouseListener(new MyListener()); //��ư���ٰ� �����ʸ� ���Դϴ�.
		defaultPanel.add(button); // ��ư�� �гο� ���Դϴ�.
		add(defaultPanel); // �г��� �������� ���Դϴ�.		
		
		pack();
		setVisible(true); // ���� �� �ֵ��� �մϴ�.
	}
	
	class MyListener implements MouseListener{
		public void mouseClicked(MouseEvent e) {
				System.out.println("��,,,�����٤Ф�"); // ���� Ŭ�� �̺�Ʈ �߻� �� ���� ������ ����մϴ�.
		}
		public void mouseEntered(MouseEvent e) { // ���� ���콺 ���� �̺�Ʈ �߻���
			int lcX = (int)(Math.random()*250);
			int lcY = (int)(Math.random()*250); // �����Լ��� �̿��Ͽ� ��ǥ���� �����մϴ�.
			
			JButton b = (JButton)e.getSource(); // ��ư�� ������
			b.setLocation(lcX, lcY); // ��ġ�� �����մϴ�.
			
			System.out.printf("x=%-5dy=%d\n",lcX,lcY); // ��ǥ�� �ֿܼ� ������ݴϴ�.
		}
		// �������̵� �ؾ��ϴµ� ���� �ʿ�����Ƿ� ���� ��ä��ϴ�!
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {	
		}
		public void mouseExited(MouseEvent e) {
		}
	}
}

public class Week12_1_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �̸� ���
				System.out.println("===================");
			    System.out.println("���� : ���̹���������");
				System.out.println("�й� : 2071060");
			    System.out.println("���� : �谡��");
			    System.out.println("===================\n");
				
				MyFrameHw f = new MyFrameHw(); // �������� �����մϴ�.
				f.setSize(300,300); // �������� ũ�⸦ �������ݴϴ�.
				f.setResizable(false); // ����� �����մϴ�.
				f.setTitle("�� ��ƺ�~��! - �谡��"); // �������� �̸��� �����մϴ�.
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �� �ڵ带 ���� ������ ����� ������� �ʽ��ϴ�.

	}

}
