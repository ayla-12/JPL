import java.util.Scanner; //스캐너를 사용하기 위한 임포트 코드

class Production{ // 부모 클래스 Production을 선언합니다.
	// 인스턴스 변수 선언
	private String title;
	private String director;
	private String writer;
	
	// 메서드 선언
	String getTitle() { //제목을 가져와주는 메서드
		return title;
	}
	String getDirector() { //감독을 가져와주는 메서드
		return director;
	}
	String getWriter() { // 작가를 가져와주는 메서드
		return writer;
	}
	void setTitle(String title) { //제목 설정을 해주는 메서드
		this.title = title; //제목을 인자로 받아 인스턴스 변수에 넣어줍니다.
	}
	void setDirector(String director) { //감독 설정을 해주는 메서드
		this.director = director; //감독을 인자로 받아 인스턴스 변수에 넣어줍니다.
	}
	void setWriter(String writer) { //작가 설정을 해주는 메서드
		this.writer = writer; //작가를 인자로 받아 인스턴스 변수에 넣어줍니다.
	}
	void display() { // 제목, 감독, 작가 출력을 해주는 메서드
		System.out.println("Title:"+getTitle()); //현재 이 클래스 내에서는 접근이 가능하지만 밖에서는 변수에 접근이 불가능하므로 메서드로 써줍니다.
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
	}
}

class Play extends Production{ // 부모 클래스인 Production을 상속받는 자식 클래스 Play를 선언해줍니다.
	private int performanceCost; // Play 내에서만 필요한 performanceCost 정수 인스턴스 변수를 선언합니다.
	
	// 메서드 선언
	int getPerformanceCost() { // private인 performanceCost 변수를 가져와주는 메서드
		return performanceCost;
	}
	void setPerformanceCost(int performanceCost) { // performanceCost를 설정해주는 메서드
		this.performanceCost = performanceCost; // 가격을 인자로 받아 인스턴스 변수에 넣어줍니다.
	}
	void display() { // 제목, 감독, 작가, 가격을 출력해주는 메서드
		System.out.println("Title:"+getTitle()); // private인 title, director, writer에 접근할 수 없으므로 메서드를 활용하여 출력해줍니다.
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
		System.out.println("performance cost:"+getPerformanceCost()+"\n");
		
	}
}
class Film extends Production{ // 부모 클래스인 Production을 상속받는 자식 클래스 Film을 선언해줍니다.
	private int boxOfficeGross; // Film 내에서만 필요한 bosOfficeGross 정수 인스턴스 변수를 선언합니다.
	
	int getBoxOfficeGross() { // private인 boxOfficeGross 변수를 가져와주는 메서드
		return boxOfficeGross;
	}
	void setBoxOfficeGross(int boxOfficeGross) { // boxOfficeGross를 설정해주는 메서드
		this.boxOfficeGross = boxOfficeGross; // 박스오피스그로스를 인자로 받아 인스턴스 변수에 넣어줍니다.
	}
	void display() { // 제목, 감독, 작가, boxOfficeGross를 출력해주는 메서드
		System.out.println("Title:"+getTitle()); // private인 title, director, writer에 접근할 수 없으므로 메서드를 활용하여 출력해줍니다.
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
		System.out.println("performance cost:"+getBoxOfficeGross()+"\n");
		
	}
}



public class Week5_1_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 클래스 선언
	    Play pd_play = new Play(); // play 클래스 선언
	    Film pd_film = new Film(); // film 클래스 선언
	    
	    // play 클래스 pd_play안의 변수에 정보를 입력받아 채워 넣습니다.
	    System.out.println("Input Title for Play");
	    pd_play.setTitle(sc.nextLine());
	    System.out.println("Input Director for Play");
	    pd_play.setDirector(sc.nextLine());
	    System.out.println("Input Writer for Play");
	    pd_play.setWriter(sc.nextLine());
	    
	    // film 클래스 pd_film안의 변수에 정보를 입력받아 채워 넣습니다.
	    System.out.println("Input Title for Film");
	    pd_film.setTitle(sc.nextLine());
	    System.out.println("Input Director for Film");
	    pd_film.setDirector(sc.nextLine());
	    System.out.println("Input Writer for Film");
	    pd_film.setWriter(sc.nextLine());
	    
	    // pd_play 안의 변수에 performanceCost 값을 입력 받아 채워 넣습니다.
	    System.out.println("Input Performance Cost for Play");
	    pd_play.setPerformanceCost(sc.nextInt());
	    
	    // pd_film 안의 변수에 boxOfficeGross 값을 입력 받아 채워 넣습니다.
	    System.out.println("Input boxOfficeGross for Film");
	    pd_film.setBoxOfficeGross(sc.nextInt());
	    
	    // 클래스 내 메서드를 사용하여 정보를 출력해줍니다.
	    pd_play.display();
	    pd_film.display();
	}

}
