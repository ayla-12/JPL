import java.util.Scanner;
class Song {
		//인스턴스 변수
		String title;
		String singer;
		int price;
		
		// 생성자 3개 정의
		Song(){	} // default 생성자 입니다.
		Song(String title, int price){ // 제목과 가격만을 받는 생성자입니다.
			this(title, "모름", price); // 아래의 생성자를 이용하기 위해 this()를 사용하여 가수가 들어오지 않을시 모름으로 출력합니다.
		}
		Song(String title, String singer, int price){ // 제목, 가수, 가격을 받는 생성자입니다.
			this.title = title; 
			this.price = price;
			this.singer = singer; 
		} // 제목, 가수, 가격을 받아 클래스의 인스턴스 변수에 집어넣어줍니다.
		
		//메서드
		void play() {
			System.out.println(title + " by "+ singer); // 노래의 제목과 가수명을 찍어주는 메서드입니다.
		} 
	}

public class Week4_1_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("===================");
	      System.out.println("전공 : 사이버보안전공");
	      System.out.println("학번 : 2071060");
	      System.out.println("성명 : 김가연");
	      System.out.println("===================\n");
	      
	      // 참조 변수를 사용하기 위해 메인에서 선언해줍니다.
	      String title; 
		  String singer;
		  int price, time; // time은 나중에 사용될 몇 번 재생하시겠습니까? 에 활용되는 정수 변수입니다.
	      Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 스캐너 클래스를 불러와줍니다.
	      
	      System.out.println("*Song 정보*");
	      while(true) { //while문을 통해 구문을 반복합니다. 
	    	  System.out.print("곡명:"); title = sc.nextLine(); // 스캐너를 통해 곡명을 받습니다. next()를 사용하면 엔터가 입력이 되지 않으므로 nextLine()을 사용합니다.
	    	  if(title=="") { // 만약 입력값이 없다면
	    		  System.out.println("곡명은 반드시 필요합니다."); // 이 문장을 출력하고 다시 구문을 반복합니다.
	    	  }
	    	  else break; // 하지만 입력값이 있다면 그대로 break해서 while문을 빠져 나옵니다.
	      }
	      System.out.print("가수명:"); singer = sc.nextLine(); //가수명을 받습니다. 가수명은 비어도 상관 없습니다.
	      System.out.print("가격:"); price = sc.nextInt(); // 가격을 받습니다. 가격은 정수이므로 nextInt()로 받아줍니다.
	      
	      // 생성자 분기점
	      if(singer=="") { //만약 가수에 받은 값이 없다면,
	    	  Song song = new Song(title, price);  // 이와 같이 가수가 없는 생성자를 불러와줍니다.
	    	  System.out.println("몇번 들으시겠습니까?"); time = sc.nextInt(); // 그리고 몇번 들을건지 time에 값을 받아줍니다.
		      for (int i = 0; i < time; i++) { // time 만큼 for 문을 돌려 클래스의 메서드인 play()를 반복합니다.
		    	  song.play();
		      }
		      System.out.println("총 "+song.price*time+"원입니다."); // 그리고 time 만큼 가격에다 곱하여 최종 가격을 계산합니다.
	      }
	      else { //만약 가수에 받은 값이 있다면,
	    	  Song song = new Song(title, singer, price); // 이와 같이 가수가 있는 생성자를 불러와줍니다.
	    	  System.out.println("몇번 들으시겠습니까?"); time = sc.nextInt(); //위의 설명과 같습니다.
		      for (int i = 0; i < time; i++) {
		    	  song.play();
		      }
		      System.out.println("총 "+song.price*time+"원입니다.");
	      }
	     
	      // if else로 생성자만 가른 뒤에 함께 for 문을 돌리는 편이 효과적이라고 생각했지만 for 문을 밖으로 빼면 song.play()를 제대로 할 수 없게 되어 반복되는 코드를 넣게 되었습니다.
	      // 이 부분을 해결하면 더 효율적인 코드가 될 것 같습니다. 조금 더 연구해보겠습니다.
	      
	      sc.close();
	}
}