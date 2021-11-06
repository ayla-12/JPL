import java.util.*; // 스캐너와 해시맵을 사용하기 위한 임포트문

public class Week10_2_김가연 {
	public static void main(String[] args) {
		//이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    System.out.println("학생의 ID와 이름을 차례로 입력하세요. (종료시 0 0 입력)");
	    Map<String, String> myMap = new HashMap<String, String>(); // 해시맵을 만들어줍니다.
	    Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 스캐너 선언을 해줍니다.
	    String ID, name, str; // 필요한 문자열 변수 3개를 만들어줍니다.
	    for(;;) { // for문을 무한반복문으로 만들어줍니다.
	    	ID = sc.next();
	    	name = sc.next(); // ID와 이름을 받습니다.
	    	if(ID.equals("0") && name.equals("0")) break; // 만약에 0과 0이 입력되었다면 즉시 for문을 빠져나갑니다.
	    	myMap.put(ID, name); // 그렇지 않다면 받은 값을 map에 추가합니다.
	    }
	    
	    Set s = myMap.keySet(); // 키 값 세트를 만듭니다.
	    Iterator<String> it = s.iterator(); // iterator 인스턴스를 생성합니다.
	    
	    System.out.println("<학생명단>");
	    System.out.printf("%-15s%-15s\n","[ID]","[NAME]");
	    while(it.hasNext()) {
	    	str = it.next(); // 아까 선언한 it 이터레이터로 값들을 읽어옵니다.
	    	System.out.printf("%-15s%-15s\n",str,myMap.get(str)); // 예쁘게 줄맞춰 출력해줍니다.
	    }
	    System.out.println("\n전체 학생 수:"+myMap.size()); // 맵에 들어있는 요소의 개수를 출력합니다.
	    
	    Iterator<String> init_It = s.iterator(); // 최대글자수와 최소글자수 변수를 초기화 하기 위한 이터레이터를 새로 선언합니다.
	    str = init_It.next();
	    int maxLength = myMap.get(str).length(), minLength = maxLength; // 초기화해줍니다.
	    String maxID = str, minID = str;
	    
	    Iterator<String> real_It = s.iterator(); // 실제로 비교해서 값을 저장하기 위한 이터레이터를 새로 선언합니다.
	    while(real_It.hasNext()) { // Map의 처음부터 끝까지 반복합니다.
	    	str = real_It.next();
	    	if(maxLength<myMap.get(str).length()) { // maxLength에 들어있는 값이 불러온 값과 비교했을 때 더 작다면,
	    		maxLength = myMap.get(str).length(); // 값을 교체해줍니다.
	    		maxID = str; // maxID에는 ID값인 str을 저장해줍니다.
	    	}
	    	if(minLength>myMap.get(str).length()) { // minLength에 들어있는 값이 불러운 값과 비교했을 때 더 크다면,
	    		minLength = myMap.get(str).length(); // 값을 교체해줍니다.
	    		minID = str; // minID에는 ID값인 str을 저장해줍니다.
	    	}
	    }
	    // 출력해주면 됩니다.
	    System.out.println("<가장 긴 이름을 가진 학생>");
	    System.out.println("ID:"+ maxID +" Name:"+myMap.get(maxID)+" 길이:"+maxLength);
	    System.out.println("<가장 짧은 이름을 가진 학생>");
	    System.out.println("ID:"+ minID +" Name:"+myMap.get(minID)+" 길이:"+minLength);	    
	    
	}

}
