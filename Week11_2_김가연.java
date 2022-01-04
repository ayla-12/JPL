import java.awt.*; 
import javax.swing.*; // 자바 GUI 사용을 위한 import문

class MyFrameHw2 extends JFrame{
	public MyFrameHw2() {
		setLayout(new BorderLayout()); // 프레임의 레이아웃을 borderlayout으로 설정합니다.
		JPanel labelPanel = new JPanel(); // 라벨이 들어가는 패널을 생성합니다.
		JPanel informationPanel = new JPanel(); // 정보를 받는 패널을 생성합니다.
		JPanel buttonPanel = new JPanel(); // 버튼을 붙일 패널을 생성합니다.
		JPanel rbPanel = new JPanel(); // 라디오 버튼을 하나로 묶어줄 라디오버튼 패널을 생성합니다.
		
		JLabel label = new JLabel("STUDENT INFORMATION");  //STUDENT INFORMATION이라는 문장의 라벨을 생성합니다.
		labelPanel.add(label); // 라벨 패널에 생성한 라벨을 붙입니다.
		
		informationPanel.setLayout(new GridLayout(0, 2)); // 인포메이션 패널의 레이아웃 설정을 그리드로 바꿉니다.
		//이름, 성별, ID, 학부의 라벨을 생성합니다.
		JLabel name = new JLabel("NAME");
		JLabel gender = new JLabel("GENDER");
		JLabel ID = new JLabel("ID");
		JLabel department = new JLabel("DEPARTMENT");
		// 텍스트 필드 세 개를 생성합니다.
		JTextField fieldName = new JTextField(10); 
		JTextField fieldID = new JTextField(10);
		JTextField fieldDep = new JTextField(10);
		// 라디오 버튼 두 개를 생성합니다.
		JRadioButton rbMale = new JRadioButton("Male");
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setSelected(true); // rbFemale 라디오버트는 디폴트 값이 설정되어있도록 해줍니다.
		
		ButtonGroup genderRb = new ButtonGroup(); // 라디오버튼 두개를 그룹으로 묶어줍니다. 
		// 생성한 그룹에 버튼 두 개를 추가합니다.
		genderRb.add(rbMale);
		genderRb.add(rbFemale);
		// 라디오 패널에 라디오버튼을 추가해줍니다.
		rbPanel.add(rbMale);
		rbPanel.add(rbFemale);
		// 인포메이션 패널에 요소들을 붙여줍니다.
		informationPanel.add(name);
		informationPanel.add(fieldName);
		informationPanel.add(gender);
		informationPanel.add(rbPanel);
		informationPanel.add(ID);
		informationPanel.add(fieldID);
		informationPanel.add(department);
		informationPanel.add(fieldDep);
		// 과제 1에서 활용했던 메서드 makeButton을 활용하여 버튼을 생성하고 버튼 패널에 붙입니다.
		makeButton("Save", buttonPanel);
		makeButton("Cancle", buttonPanel);
		// 만들어진 패널들을 프레임에 붙여줍니다.
		add(labelPanel, BorderLayout.NORTH);
		add(informationPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true); // 그려진 화면을 볼 수 있도록 합니다.
	}
	public void makeButton(String text, JPanel panel) { // 과제 1에서 사용되었던 메서드입니다.
		JButton button = new JButton(text);
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class Week11_2_김가연 {
	public static void main(String[] args) {
		// 이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
		
		MyFrameHw2 f = new MyFrameHw2(); // 프레임을 생성합니다.
		f.setSize(350,200); // 프레임의 크기를 설정합니다.
		f.setTitle("Student Information"); // 프레임의 이름을 설정합니다.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // gui 창의 닫기 버튼을 누르면 프로그램이 종료됩니다.
	}

}
