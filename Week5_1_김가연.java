import java.util.Scanner; //��ĳ�ʸ� ����ϱ� ���� ����Ʈ �ڵ�

class Production{ // �θ� Ŭ���� Production�� �����մϴ�.
	// �ν��Ͻ� ���� ����
	private String title;
	private String director;
	private String writer;
	
	// �޼��� ����
	String getTitle() { //������ �������ִ� �޼���
		return title;
	}
	String getDirector() { //������ �������ִ� �޼���
		return director;
	}
	String getWriter() { // �۰��� �������ִ� �޼���
		return writer;
	}
	void setTitle(String title) { //���� ������ ���ִ� �޼���
		this.title = title; //������ ���ڷ� �޾� �ν��Ͻ� ������ �־��ݴϴ�.
	}
	void setDirector(String director) { //���� ������ ���ִ� �޼���
		this.director = director; //������ ���ڷ� �޾� �ν��Ͻ� ������ �־��ݴϴ�.
	}
	void setWriter(String writer) { //�۰� ������ ���ִ� �޼���
		this.writer = writer; //�۰��� ���ڷ� �޾� �ν��Ͻ� ������ �־��ݴϴ�.
	}
	void display() { // ����, ����, �۰� ����� ���ִ� �޼���
		System.out.println("Title:"+getTitle()); //���� �� Ŭ���� �������� ������ ���������� �ۿ����� ������ ������ �Ұ����ϹǷ� �޼���� ���ݴϴ�.
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
	}
}

class Play extends Production{ // �θ� Ŭ������ Production�� ��ӹ޴� �ڽ� Ŭ���� Play�� �������ݴϴ�.
	private int performanceCost; // Play �������� �ʿ��� performanceCost ���� �ν��Ͻ� ������ �����մϴ�.
	
	// �޼��� ����
	int getPerformanceCost() { // private�� performanceCost ������ �������ִ� �޼���
		return performanceCost;
	}
	void setPerformanceCost(int performanceCost) { // performanceCost�� �������ִ� �޼���
		this.performanceCost = performanceCost; // ������ ���ڷ� �޾� �ν��Ͻ� ������ �־��ݴϴ�.
	}
	void display() { // ����, ����, �۰�, ������ ������ִ� �޼���
		System.out.println("Title:"+getTitle()); // private�� title, director, writer�� ������ �� �����Ƿ� �޼��带 Ȱ���Ͽ� ������ݴϴ�.
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
		System.out.println("performance cost:"+getPerformanceCost()+"\n");
		
	}
}
class Film extends Production{ // �θ� Ŭ������ Production�� ��ӹ޴� �ڽ� Ŭ���� Film�� �������ݴϴ�.
	private int boxOfficeGross; // Film �������� �ʿ��� bosOfficeGross ���� �ν��Ͻ� ������ �����մϴ�.
	
	int getBoxOfficeGross() { // private�� boxOfficeGross ������ �������ִ� �޼���
		return boxOfficeGross;
	}
	void setBoxOfficeGross(int boxOfficeGross) { // boxOfficeGross�� �������ִ� �޼���
		this.boxOfficeGross = boxOfficeGross; // �ڽ����ǽ��׷ν��� ���ڷ� �޾� �ν��Ͻ� ������ �־��ݴϴ�.
	}
	void display() { // ����, ����, �۰�, boxOfficeGross�� ������ִ� �޼���
		System.out.println("Title:"+getTitle()); // private�� title, director, writer�� ������ �� �����Ƿ� �޼��带 Ȱ���Ͽ� ������ݴϴ�.
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
		System.out.println("performance cost:"+getBoxOfficeGross()+"\n");
		
	}
}



public class Week5_1_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� Ŭ���� ����
	    Play pd_play = new Play(); // play Ŭ���� ����
	    Film pd_film = new Film(); // film Ŭ���� ����
	    
	    // play Ŭ���� pd_play���� ������ ������ �Է¹޾� ä�� �ֽ��ϴ�.
	    System.out.println("Input Title for Play");
	    pd_play.setTitle(sc.nextLine());
	    System.out.println("Input Director for Play");
	    pd_play.setDirector(sc.nextLine());
	    System.out.println("Input Writer for Play");
	    pd_play.setWriter(sc.nextLine());
	    
	    // film Ŭ���� pd_film���� ������ ������ �Է¹޾� ä�� �ֽ��ϴ�.
	    System.out.println("Input Title for Film");
	    pd_film.setTitle(sc.nextLine());
	    System.out.println("Input Director for Film");
	    pd_film.setDirector(sc.nextLine());
	    System.out.println("Input Writer for Film");
	    pd_film.setWriter(sc.nextLine());
	    
	    // pd_play ���� ������ performanceCost ���� �Է� �޾� ä�� �ֽ��ϴ�.
	    System.out.println("Input Performance Cost for Play");
	    pd_play.setPerformanceCost(sc.nextInt());
	    
	    // pd_film ���� ������ boxOfficeGross ���� �Է� �޾� ä�� �ֽ��ϴ�.
	    System.out.println("Input boxOfficeGross for Film");
	    pd_film.setBoxOfficeGross(sc.nextInt());
	    
	    // Ŭ���� �� �޼��带 ����Ͽ� ������ ������ݴϴ�.
	    pd_play.display();
	    pd_film.display();
	}

}
