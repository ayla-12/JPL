import javax.swing.JOptionPane; // 자바 스윙을 통해 옵션페인에서 값을 받습니다.

class SharedArea{ // 적당한 공유 공간을 선언해줍니다.
	boolean stop;
	String temp;
}

class MyThread extends Thread{
	SharedArea sharedArea; // 마이 스레드에서 공유공간을 사용합니다.
    int count=0;
    
	public void setStop(boolean stop) {
		sharedArea.stop = stop; // 인자로 들어온 값에 따라 공유 공간의 인자를 바꿔줍니다.
	}
	// 단어 목록입니다.
	String[] strArr = new String[] {"cat", "dog", "java", "love", "cake", "happy","giant", "apple", "school","rock","skz","chirstmas","action","cyber","security"};
	
	public void run() {		
		for(int i =20; i>0; i--) { //20초 동안 진행합니다.
			if(sharedArea.stop==true) break; // 공유공간의 stop 변수가 true라면 for문을 빠져나갑니다.
			int randomValue = (int)(Math.random()*15); // 랜덤으로 단어를 골라줍니다.
			sharedArea.temp = strArr[randomValue];
			System.out.println(sharedArea.temp);
			try {
				count++; // 카운트 수를 늘려줍니다.
				sleep(1000); //1초마다 단어가 하나씩 나옵니다.
			}
			catch(InterruptedException e) { // 오류 제어
				System.out.println(e.getMessage());
			}
		}
		if(count == 20) { // 만약 20초 동안 성공하지 못하면
			System.out.println("실패!"); // 실패를 출력하고
			System.exit(0); // 프로그램을 정상종료합니다.
		}
		else { // 아니라면
			System.out.println("성공!"); // 성공을 출력하고
			System.out.println("Timer is stopped."); 
			System.exit(0); // 프로그램을 정상종료합니다.
		}
	}
}

public class Week13_2_김가연 {
	public static void main(String[] args) {
		// 이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");

		MyThread th = new MyThread(); // 스레드를 만들고
		SharedArea SH = new SharedArea(); // 공유공간도 만듭니다.
		
	    th.sharedArea = SH; // 생성한 공유공간을 스레드에서 활용합니다.
	    
		th.start();
		
		while(true){
			String st = JOptionPane.showInputDialog("문자열 입력"); // 옵션 페인을 띄웁니다.
			System.out.println("<"+st+">을 입력하셨습니다.");
			if(st.equals(SH.temp)) { // 만약 공유공간의 temp와 사용자가 입력한 st가 같으면
				th.setStop(true); // setStop에 인자로 true를 넘겨줍니다.
			}
		}
	}
}
