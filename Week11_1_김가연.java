import java.awt.*; 
import javax.swing.*; // �ڹ� GUI ����� ���� import��

class MyFrameHw extends JFrame{
	public MyFrameHw() {		
		setLayout(new BorderLayout()); // �������� ���̾ƿ��� borderlayout���� �����մϴ�.
		JPanel textfieldPanel = new JPanel(); // �г� �ΰ��� ������ݴϴ�. �ϳ��� �ؽ�Ʈ�� ���̴� ����,
		JPanel buttonPanel = new JPanel(); // �ϳ��� ��ư�� �ִ� �г��Դϴ�.
		
		buttonPanel.setLayout(new GridLayout(0, 4)); // ��ư�� �׸��� �������� �����ؾ��ϹǷ�, �׸��� ���̾ƿ�
		
		JTextField field = new JTextField(25); // �ؽ�Ʈ �ʵ��� ũ�⸦ 25�� �������ְ�, �����մϴ�.
		field.setHorizontalAlignment(JTextField.RIGHT); // �����ʺ��� ���ڰ� �������� ������ �����մϴ�.
		
		textfieldPanel.add(field); // �ؽ�Ʈ�ʵ� �гο� ��� ������ �ؽ�Ʈ �ʵ带 ���Դϴ�.
		
		// makeButton �޼��带 �̿��Ͽ� ��ư 16���� ���Դϴ�.
		makeButton("ON",buttonPanel);
		makeButton("AC",buttonPanel);
		makeButton("C",buttonPanel);
		makeButton("OFF",buttonPanel);
		makeButton("7",buttonPanel);
		makeButton("8",buttonPanel);
		makeButton("9",buttonPanel);
		makeButton("/",buttonPanel);
		makeButton("4",buttonPanel);
		makeButton("5",buttonPanel);
		makeButton("6",buttonPanel);
		makeButton("X",buttonPanel);
		makeButton("1",buttonPanel);
		makeButton("2",buttonPanel);
		makeButton("3",buttonPanel);
		makeButton("-",buttonPanel);
		makeButton("0",buttonPanel);
		makeButton(".",buttonPanel);
		makeButton("=",buttonPanel);
		makeButton("+",buttonPanel);
		// ���� ȿ�����̰� �ϰ� �;� �ݺ����� �����غ����� �߰��߰� ��ȣ�� �־� �Ȱ��� ���� �ڵ带 ����� �� ���� ����� �̷��� �����߽��ϴ�.
		add(textfieldPanel, BorderLayout.NORTH); // �ؽ�Ʈ �ʵ� �г��� �������� north ���⿡ ���Դϴ�.
		add(buttonPanel, BorderLayout.CENTER); // ��ư �г��� �������� center�� ���Դϴ�.
		
		pack();
		setVisible(true); // ���� �� �ֵ��� �մϴ�.
	}
	// makeButton �޼��� ����
	public void makeButton(String text, JPanel panel) { // String�� JPanel�� �ν��Ͻ� ������ �޽��ϴ�.
		JButton button = new JButton(text); // ���� String���� ��ư�� �����մϴ�.
		button.setAlignmentX(CENTER_ALIGNMENT); // ��� ����
		panel.add(button); // ���� JPanel�� ������ ��ư�� ���Դϴ�.
	}
}

public class Week11_1_�谡�� {
	public static void main(String[] args) {
		// �̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
		
		MyFrameHw f = new MyFrameHw(); // �������� �����մϴ�.
		f.setSize(300,200); // �������� ũ�⸦ �������ݴϴ�.
		f.setTitle("Calculator"); // �������� �̸��� �����մϴ�.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �� �ڵ带 ���� ������ ����� ������� �ʽ��ϴ�.
	}

}
