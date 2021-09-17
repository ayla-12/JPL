import java.util.Scanner;


class MyFile {
	//인스턴스 변수 선언
	String title;
	int page;
	
	//메서드 목록
	void setTitle(String title) {
		this.title = title;  // 지역 변수를 인스턴스 변수에 넣습니다.
	} 
	String getTitle() {
		return title; // title이 private 일 때를 대비하여 getter를 만들어줍니다.
	}
	void setPage(int page) {
		this.page = page; // 지역 변수를 인스턴스 변수에 넣습니다.
	}
	int getPage() {
		return page; // page가 private 일 때를 대비하여 getter를 만들어줍니다.
	}
	void fileCopy(MyFile mf) { // 인스턴스 mf안에 원래의 인스턴스 변수를 복사해주는 함수입니다.
		mf.title = this.title;
		mf.page = this.page;
	}
	void fileInfo() {
		System.out.println("파일제목:"+getTitle()); //getter를 사용하여 파일제목과 페이지, 즉 파일 정보를 출력해줍니다.
		System.out.println("페이지:"+getPage());
	}
	
}

public class Week3_3_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		Scanner kbd = new Scanner(System.in);
		String title; // 이 코드 
		int page; 	//두줄은 없어도 될 것 같습니다.
		
		MyFile fOld = new MyFile(); //원래 file과
		MyFile fNew = new MyFile(); //새로 만드는 file 인스턴스를 만들어줍니다.
		
		System.out.println("--File정보입력 (제목,페이지수)--");
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt()); // 스캐너로 받아줍니다.
		fOld.fileCopy(fNew); // 파일 카피 진행
		System.out.println("<원래 File>");
		fOld.fileInfo();
		System.out.println("<복사된 File>");
		fNew.fileInfo(); //파일 정보를 출력해줍니다.
	}

}
