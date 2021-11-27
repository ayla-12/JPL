import java.util.Scanner; // 스캐너 사용을 위한 import문
import java.lang.Thread; // 스레드는 원래 자동 import지만 강조하기 위해!

class SharedArea{  // 문제에서 주어진 sharedarea
	double ratio;
	boolean isReady; 
}

class SimulThread extends Thread{
	SharedArea sharedArea; // Shared Area를 통해 데이터 교환을 할 수 있도록 합니다.
	double rat;
	int num;
	SimulThread(int num){
		this.num = num; // num을 인자로 받는 생성자
	}
	public void run() {
		int count = 0;
		for(int i = 0; i < num; i++) { //num의 숫자에 따라서 아래를 계산, 반복합니다.
			if((Math.round(Math.random()*100)/100.0)>0.5) {
				count++; // 만약 랜덤 넘버가 0.5 이상이라면 카운트 수를 올립니다.
			}
		}
		rat = (double)count / (double)num; // 카운트를 num으로 나눠 비율을 계산합니다.
		sharedArea.ratio = rat; // 공유 공간에 비율을 넣습니다.
		sharedArea.isReady = true; // 이제 준비가 되었습니다.
		synchronized(sharedArea) {
			sharedArea.notifyAll(); // 준비가 되었다는 싱크로 신호를 보냅니다.
		}
	}	
}
class PrintThread extends Thread{
	SharedArea sharedArea; // 공유 공간을 통해 데이터 교환을 할 수 있도록 합니다.
	public void run() {
		if(sharedArea.isReady!=true) { // 만약 준비가 안되었다면
			try {
				synchronized(sharedArea) {
					sharedArea.wait(); // 기다립니다.
				}
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage()); // 오류 제어를 꼭 해줍니다.
			}
		}
		System.out.printf("Front Ratio: %.2f%%",sharedArea.ratio*100); // 준비가 되어있다고 공유 공간에 있는 isReady가 true고, notify를 받았다면 옆을 출력합니다.
	}
}

public class Week13_1_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Input the number of coin toss:");
	    int num = sc.nextInt(); // 스캐너를 통해 얼마나 계산할지 값을 받습니다.
	    
	    SimulThread th1 = new SimulThread(num); //시뮬레이터 스레드와
	    PrintThread th2 = new PrintThread(); // 프린트 스레드를 만들어줍니다.
	    
	    SharedArea SH = new SharedArea();  //공유공간도 만듭니다.
	    
	    th1.sharedArea = SH; // 위에서 선언한 공유 공간을 th1에서 사용합니다.
	    th2.sharedArea = SH; // 위와 같습니다.
	    
	    th1.start();
	    th2.start();
	    
	}

}

