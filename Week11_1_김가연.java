import java.awt.*; 
import javax.swing.*; // 자바 GUI 사용을 위한 import문

class MyFrameHw extends JFrame{
	public MyFrameHw() {		
		setLayout(new BorderLayout()); // 프레임의 레이아웃을 borderlayout으로 설정합니다.
		JPanel textfieldPanel = new JPanel(); // 패널 두개를 만들어줍니다. 하나는 텍스트가 보이는 공간,
		JPanel buttonPanel = new JPanel(); // 하나는 버튼이 있는 패널입니다.
		
		buttonPanel.setLayout(new GridLayout(0, 4)); // 버튼을 그리드 형식으로 정렬해야하므로, 그리드 레이아웃
		
		JTextField field = new JTextField(25); // 텍스트 필드의 크기를 25로 지정해주고, 생성합니다.
		field.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽부터 글자가 나오도록 오른쪽 정렬합니다.
		
		textfieldPanel.add(field); // 텍스트필드 패널에 방금 생성한 텍스트 필드를 붙입니다.
		
		// makeButton 메서드를 이용하여 버튼 16개를 붙입니다.
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
		// 좀더 효율적이게 하고 싶어 반복문을 생각해봤으나 중간중간 기호가 있어 똑같이 많은 코드를 써야할 것 같아 현재는 이렇게 구현했습니다.
		add(textfieldPanel, BorderLayout.NORTH); // 텍스트 필드 패널을 프레임의 north 방향에 붙입니다.
		add(buttonPanel, BorderLayout.CENTER); // 버튼 패널을 프레임의 center에 붙입니다.
		
		pack();
		setVisible(true); // 보일 수 있도록 합니다.
	}
	// makeButton 메서드 정의
	public void makeButton(String text, JPanel panel) { // String과 JPanel을 인스턴스 변수로 받습니다.
		JButton button = new JButton(text); // 받은 String으로 버튼을 생성합니다.
		button.setAlignmentX(CENTER_ALIGNMENT); // 가운데 정렬
		panel.add(button); // 받은 JPanel에 생성한 버튼을 붙입니다.
	}
}

public class Week11_1_김가연 {
	public static void main(String[] args) {
		// 이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
		
		MyFrameHw f = new MyFrameHw(); // 프레임을 생성합니다.
		f.setSize(300,200); // 프레임의 크기를 지정해줍니다.
		f.setTitle("Calculator"); // 프레임의 이름을 지정합니다.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 코드를 쓰지 않으면 제대로 종료되지 않습니다.
	}

}
