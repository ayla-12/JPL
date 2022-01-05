import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // 자바 GUI 사용을 위한 import문

class MyFrameHw2 extends JFrame implements ActionListener{
	int status = 1; // 라디오버튼 정보를 받기 위해 status 변수를 만듭니다.
	// 라디오버튼을 생성합니다.
	JRadioButton rbRed = new JRadioButton("RED");
	JRadioButton rbGreen = new JRadioButton("GREEN");
	JRadioButton rbBlue = new JRadioButton("BLUE");
	JButton button = new JButton("Paint"); // 버튼을 생성합니다.	
	
	public MyFrameHw2() {
		setLayout(new BorderLayout()); // 프레임의 레이아웃을 borderlayout으로 설정합니다.
		JPanel radioPanel = new JPanel(); // 패널을 만듭니다.
		
		rbRed.setSelected(true); // rbRed 라디오버튼이 디폴트 값이 설정되어있도록 해줍니다.
		ButtonGroup colorRb = new ButtonGroup(); // 라디오버튼을 그룹으로 묶어줍니다. 
		// 생성한 그룹에 버튼 세 개를 추가합니다.
		colorRb.add(rbRed);
		colorRb.add(rbGreen);
		colorRb.add(rbBlue);
		// 라디오 패널에 라디오버튼을 추가해줍니다.
		radioPanel.add(rbRed);
		radioPanel.add(rbGreen);
		radioPanel.add(rbBlue);
		radioPanel.add(button); // 페인트 버튼도 추가해줍니다.
		//리스너를 붙여줍니다.
		rbRed.addActionListener(this);
		rbGreen.addActionListener(this);
		rbBlue.addActionListener(this);
		button.addActionListener(this);
		// 패널을 프레임이 붙입니다.
		add(radioPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true); // 보일 수 있도록 합니다.
	}
	public void actionPerformed(ActionEvent e) { 
	        if(e.getSource() == rbRed ){ // 만약 버튼이 RED라면 status를 1로 설정합니다.
	            status = 1;            
	        }
	        else if(e.getSource() == rbGreen){ // 만약 버튼이 GREEN이라면 status를 1로 설정합니다.
	            status = 2;
	        }
	        else if(e.getSource() == rbBlue){ // 만약 버튼이 BLUE라면 status를 3으로 설정합니다.
	            status = 3;
	        } 
	        else if(e.getSource()== button) { // Paint 버튼을 누르면
	        	repaint(); // repaint 합니다.
	        }     
	}
	public void paint(Graphics g) {
		super.paint(g);
		switch(status)
        {
           case 1: // status에 따라 색을 다르게 해서 자동차 본체를 그립니다.
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
		//바퀴도 그립니다.
		g.setColor(Color.gray);
		g.fillOval(145, 225, 75, 75);
		g.setColor(Color.gray);
		g.fillOval(285, 225, 75, 75);
		// 웃는 자동차의 눈입니다.
		g.setColor(Color.black);
		g.drawArc(275,130,40,60,0,180);	
	}	
}

public class Week12_2_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
		
		MyFrameHw2 f = new MyFrameHw2(); // 프레임을 생성합니다.
		f.setSize(500,350); // 프레임의 크기를 지정해줍니다.
		f.setTitle("MyCar - 김가연"); // 프레임의 이름을 지정합니다.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 코드를 쓰지 않으면 제대로 종료되지 않습니다.
	}

}
