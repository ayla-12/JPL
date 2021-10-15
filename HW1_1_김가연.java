import java.util.Scanner; // 스캐너 사용을 위한 임포트문
class Time{ // Time 클래스 선언
	// 멤버 변수 선언
	private int hour = 0;
	private int minute = 0;
	// 메서드 선언
	private boolean isVaild(int hour, int minute) { // 시간과 분을 인자로 받아서 맞는 값인지 확인하는 메서드
		if(hour>=0 && hour<=23 && minute >=0 && minute <=59) // 범위 안에 속하면
		return true; // true를 반환합니다.
		else return false; // 범위 밖이라면 false를 반환합니다.
	}
	void setTime(int hour, int minute) { // 사용자로부터 시간을 받아 클래스 내 인스턴스에 집어 넣는 메서드
		if(isVaild(hour,minute)) { // 만약 유효한 값이라고 판단하면,
			this.hour = hour; // 클래스 내의 변수에 시간과
			this.minute = minute; // 분을 넣습니다.
		}
		else { // 만약 true값이 오지 않았다면,
			System.out.println("Wrong Input"); // 범위안에 속한 것이 아니므로 오류 문장을 출력해줍니다.
		}
	}
	int getTime(char ch) { // 넘겨받은 인자의 알파벳이 따라 출력되는 요소를 달리 할 수 있는 메서드
		if(ch == 'h' || ch == 'H') { // h나 H를 넘겨 받으면
			return hour; // 시간을 리턴합니다.
		}
		else if(ch == 'm' || ch =='M') { // 만약 m이나 M을 넘겨 받으면
			return minute; // 분을 리턴합니다.
		}
		else return 0; // 다른 글자가 들어온다면 0을 리턴합니다.
	}
	

}

public class HW1_1_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
		
		Scanner sc = new Scanner(System.in); // 스캐너 사용을 이해 스캐너 클래스를 생성합니다.
		Time t1 = new Time(); // Time 클래스 생성
		
		int hour, minute; // 입력을 받기 위한 지역 변수 선언
		
		System.out.println("Hour:"); 
		hour = sc.nextInt(); // 사용자로부터 시간을 받아 hour에 저장합니다.
		
		System.out.println("Minute:");
		minute = sc.nextInt(); // 사용자로부터 분을 받아 minute에 저장합니다.
		
		t1.setTime(hour, minute); // 입력받은 값을 클래스의 메서드 인자로 넘깁니다.
		System.out.printf("%d:%d",t1.getTime('h'),t1.getTime('m')); // 양식에 맞춰 메서드로부터 리턴된 값을 출력합니다.
	
		sc.close(); // 스캐너 사용이 끝났으니 닫아줍니다.
	}

}
