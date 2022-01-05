import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // �ڹ� GUI ����� ���� import��

class MyFrameHw2 extends JFrame implements ActionListener{
	int status = 1; // ������ư ������ �ޱ� ���� status ������ ����ϴ�.
	// ������ư�� �����մϴ�.
	JRadioButton rbRed = new JRadioButton("RED");
	JRadioButton rbGreen = new JRadioButton("GREEN");
	JRadioButton rbBlue = new JRadioButton("BLUE");
	JButton button = new JButton("Paint"); // ��ư�� �����մϴ�.	
	
	public MyFrameHw2() {
		setLayout(new BorderLayout()); // �������� ���̾ƿ��� borderlayout���� �����մϴ�.
		JPanel radioPanel = new JPanel(); // �г��� ����ϴ�.
		
		rbRed.setSelected(true); // rbRed ������ư�� ����Ʈ ���� �����Ǿ��ֵ��� ���ݴϴ�.
		ButtonGroup colorRb = new ButtonGroup(); // ������ư�� �׷����� �����ݴϴ�. 
		// ������ �׷쿡 ��ư �� ���� �߰��մϴ�.
		colorRb.add(rbRed);
		colorRb.add(rbGreen);
		colorRb.add(rbBlue);
		// ���� �гο� ������ư�� �߰����ݴϴ�.
		radioPanel.add(rbRed);
		radioPanel.add(rbGreen);
		radioPanel.add(rbBlue);
		radioPanel.add(button); // ����Ʈ ��ư�� �߰����ݴϴ�.
		//�����ʸ� �ٿ��ݴϴ�.
		rbRed.addActionListener(this);
		rbGreen.addActionListener(this);
		rbBlue.addActionListener(this);
		button.addActionListener(this);
		// �г��� �������� ���Դϴ�.
		add(radioPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true); // ���� �� �ֵ��� �մϴ�.
	}
	public void actionPerformed(ActionEvent e) { 
	        if(e.getSource() == rbRed ){ // ���� ��ư�� RED��� status�� 1�� �����մϴ�.
	            status = 1;            
	        }
	        else if(e.getSource() == rbGreen){ // ���� ��ư�� GREEN�̶�� status�� 1�� �����մϴ�.
	            status = 2;
	        }
	        else if(e.getSource() == rbBlue){ // ���� ��ư�� BLUE��� status�� 3���� �����մϴ�.
	            status = 3;
	        } 
	        else if(e.getSource()== button) { // Paint ��ư�� ������
	        	repaint(); // repaint �մϴ�.
	        }     
	}
	public void paint(Graphics g) {
		super.paint(g);
		switch(status)
        {
           case 1: // status�� ���� ���� �ٸ��� �ؼ� �ڵ��� ��ü�� �׸��ϴ�.
            g.setColor(Color.red);
            g.fillRect(180, 100, 140, 60);
        	g.fillRect(110, 160, 280, 100);
            break;
           case 2:
        	g.setColor(Color.green);
            g.fillRect(180, 100, 140, 60);
           	g.fillRect(110, 160, 280, 100);
            break;
            case 3:
            g.setColor(Color.blue);
            g.fillRect(180, 100, 140, 60);
            g.fillRect(110, 160, 280, 100);
            break;
        }
		//������ �׸��ϴ�.
		g.setColor(Color.gray);
		g.fillOval(145, 225, 75, 75);
		g.setColor(Color.gray);
		g.fillOval(285, 225, 75, 75);
		// ���� �ڵ����� ���Դϴ�.
		g.setColor(Color.black);
		g.drawArc(275,130,40,60,0,180);	
	}	
}

public class Week12_2_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
		
		MyFrameHw2 f = new MyFrameHw2(); // �������� �����մϴ�.
		f.setSize(500,350); // �������� ũ�⸦ �������ݴϴ�.
		f.setTitle("MyCar - �谡��"); // �������� �̸��� �����մϴ�.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �� �ڵ带 ���� ������ ����� ������� �ʽ��ϴ�.
	}

}
