import java.util.Scanner;

class Song {
		//인스턴스 변수
		String title;
		String singer;
		int price;
		
		
		//메서드
		void play() {
			System.out.println("노래들어요 : \""+ title + "\" by "+ singer);
		} // 탈출문자를 이용해서 큰따옴표를 넣어줍니다.
		
		void price() {
			System.out.println(price + "원입니다. ");
		}
	}


public class Week3_1_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		//클래스로 인스턴스 2개와 스캐너 사용을 위해 스캐너를 선언해줍니다.
		Song s1 = new Song();
		Song s2 = new Song();
		Scanner sc = new Scanner(System.in);
		
		
		//song 1의 제목, 가수, 가격을 스캐너를 이용해 받습니다.
		System.out.println("*Song 1*");
		System.out.print("곡명입력:");
		s1.title = sc.nextLine();
		System.out.print("가수명입력:");
		s1.singer = sc.nextLine();
		System.out.print("가격입력:");
		s1.price = sc.nextInt();
		
		sc.nextLine(); //int를 받으면 엔터가 버퍼에 남기 때문에 이 코드를 이용해 엔터를 먹어줍니다.
		
		//song 2의 제목, 가수, 가격을 스캐너를 이용해 받습니다.		
		System.out.println("\n*Song 2*");
		System.out.print("곡명입력:");
		s2.title = sc.nextLine();
		System.out.print("가수명입력:");
		s2.singer = sc.nextLine();
		System.out.print("가격입력:");
		s2.price = sc.nextInt();
		
		//노래 선택을 위해 노래 제목을 가져와서 출력해줍니다.
		System.out.println("\n노래를 고르세요");
		System.out.println("1:"+s1.title+" 2:"+s2.title);
		
		int select = sc.nextInt();
		
		//select 변수에 받아온 숫자를 저장해서 if문으로 결과를 출력해줍니다.
		if(select == 1) {
			s1.play();
			s1.price();
		}
		else {
			s2.play();
			s2.price();
		}
		
		System.out.println("감사합니다."); //마지막 인사를 해줍니다.
		sc.close(); //스캐너를 닫아줍니다.
		
	}

}
