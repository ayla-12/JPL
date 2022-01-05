import java.awt.event.*;
import javax.swing.*; // 자바 GUI 사용을 위한 import문

class MyFrameHw extends JFrame{
	public MyFrameHw() {		
		JPanel defaultPanel = new JPanel(); // 패널을 만듭니다.
		JButton button = new JButton("Click!"); // 버튼을 생성합니다.
		button.addMouseListener(new MyListener()); //버튼에다가 리스너를 붙입니다.
		defaultPanel.add(button); // 버튼을 패널에 붙입니다.
		add(defaultPanel); // 패널을 프레임이 붙입니다.		
		
		pack();
		setVisible(true); // 보일 수 있도록 합니다.
	}
	
	class MyListener implements MouseListener{
		public void mouseClicked(MouseEvent e) {
				System.out.println("윽,,,잡혔다ㅠㅠ"); // 만약 클릭 이벤트 발생 시 다음 문구를 출력합니다.
		}
		public void mouseEntered(MouseEvent e) { // 만약 마우스 오버 이벤트 발생시
			int lcX = (int)(Math.random()*250);
			int lcY = (int)(Math.random()*250); // 랜덤함수를 이용하여 좌표값을 설정합니다.
			
			JButton b = (JButton)e.getSource(); // 버튼을 가져와
			b.setLocation(lcX, lcY); // 위치를 설정합니다.
			
			System.out.printf("x=%-5dy=%d\n",lcX,lcY); // 좌표를 콘솔에 출력해줍니다.
		}
		// 오버라이딩 해야하는데 굳이 필요없으므로 속은 안채웁니다!
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {	
		}
		public void mouseExited(MouseEvent e) {
		}
	}
}

public class Week12_1_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름 출력
				System.out.println("===================");
			    System.out.println("전공 : 사이버보안전공");
				System.out.println("학번 : 2071060");
			    System.out.println("성명 : 김가연");
			    System.out.println("===================\n");
				
				MyFrameHw f = new MyFrameHw(); // 프레임을 생성합니다.
				f.setSize(300,300); // 프레임의 크기를 지정해줍니다.
				f.setResizable(false); // 사이즈를 고정합니다.
				f.setTitle("나 잡아봐~라! - 김가연"); // 프레임의 이름을 지정합니다.
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 코드를 쓰지 않으면 제대로 종료되지 않습니다.

	}

}
