//2주차 예제 3
public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA:
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) break AA;
				System.out.println("Value of i is "+i
						+ ", value of j is "+j);
			}
		} 
	
	}

}

// Label 을 사용해서 break AA를 하면 j가 3이 되자마자 반복문이 끝남 -> 문장이 세 개밖에 안생김!
