import java.awt.*; 
import javax.swing.*; // �ڹ� GUI ����� ���� import��

class MyFrameHw2 extends JFrame{
	public MyFrameHw2() {
		setLayout(new BorderLayout()); // �������� ���̾ƿ��� borderlayout���� �����մϴ�.
		JPanel labelPanel = new JPanel(); // ���� ���� �г��� �����մϴ�.
		JPanel informationPanel = new JPanel(); // ������ �޴� �г��� �����մϴ�.
		JPanel buttonPanel = new JPanel(); // ��ư�� ���� �г��� �����մϴ�.
		JPanel rbPanel = new JPanel(); // ���� ��ư�� �ϳ��� ������ ������ư �г��� �����մϴ�.
		
		JLabel label = new JLabel("STUDENT INFORMATION");  //STUDENT INFORMATION�̶�� ������ ���� �����մϴ�.
		labelPanel.add(label); // �� �гο� ������ ���� ���Դϴ�.
		
		informationPanel.setLayout(new GridLayout(0, 2)); // �������̼� �г��� ���̾ƿ� ������ �׸���� �ٲߴϴ�.
		//�̸�, ����, ID, �к��� ���� �����մϴ�.
		JLabel name = new JLabel("NAME");
		JLabel gender = new JLabel("GENDER");
		JLabel ID = new JLabel("ID");
		JLabel department = new JLabel("DEPARTMENT");
		// �ؽ�Ʈ �ʵ� �� ���� �����մϴ�.
		JTextField fieldName = new JTextField(10); 
		JTextField fieldID = new JTextField(10);
		JTextField fieldDep = new JTextField(10);
		// ���� ��ư �� ���� �����մϴ�.
		JRadioButton rbMale = new JRadioButton("Male");
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setSelected(true); // rbFemale ������Ʈ�� ����Ʈ ���� �����Ǿ��ֵ��� ���ݴϴ�.
		
		ButtonGroup genderRb = new ButtonGroup(); // ������ư �ΰ��� �׷����� �����ݴϴ�. 
		// ������ �׷쿡 ��ư �� ���� �߰��մϴ�.
		genderRb.add(rbMale);
		genderRb.add(rbFemale);
		// ���� �гο� ������ư�� �߰����ݴϴ�.
		rbPanel.add(rbMale);
		rbPanel.add(rbFemale);
		// �������̼� �гο� ��ҵ��� �ٿ��ݴϴ�.
		informationPanel.add(name);
		informationPanel.add(fieldName);
		informationPanel.add(gender);
		informationPanel.add(rbPanel);
		informationPanel.add(ID);
		informationPanel.add(fieldID);
		informationPanel.add(department);
		informationPanel.add(fieldDep);
		// ���� 1���� Ȱ���ߴ� �޼��� makeButton�� Ȱ���Ͽ� ��ư�� �����ϰ� ��ư �гο� ���Դϴ�.
		makeButton("Save", buttonPanel);
		makeButton("Cancle", buttonPanel);
		// ������� �гε��� �����ӿ� �ٿ��ݴϴ�.
		add(labelPanel, BorderLayout.NORTH);
		add(informationPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true); // �׷��� ȭ���� �� �� �ֵ��� �մϴ�.
	}
	public void makeButton(String text, JPanel panel) { // ���� 1���� ���Ǿ��� �޼����Դϴ�.
		JButton button = new JButton(text);
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class Week11_2_�谡�� {
	public static void main(String[] args) {
		// �̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
		
		MyFrameHw2 f = new MyFrameHw2(); // �������� �����մϴ�.
		f.setSize(350,200); // �������� ũ�⸦ �����մϴ�.
		f.setTitle("Student Information"); // �������� �̸��� �����մϴ�.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // gui â�� �ݱ� ��ư�� ������ ���α׷��� ����˴ϴ�.
	}

}
