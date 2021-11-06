import java.util.*; // ��ĳ�ʿ� �ؽø��� ����ϱ� ���� ����Ʈ��

public class Week10_2_�谡�� {
	public static void main(String[] args) {
		//�̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    System.out.println("�л��� ID�� �̸��� ���ʷ� �Է��ϼ���. (����� 0 0 �Է�)");
	    Map<String, String> myMap = new HashMap<String, String>(); // �ؽø��� ������ݴϴ�.
	    Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� ������ ���ݴϴ�.
	    String ID, name, str; // �ʿ��� ���ڿ� ���� 3���� ������ݴϴ�.
	    for(;;) { // for���� ���ѹݺ������� ������ݴϴ�.
	    	ID = sc.next();
	    	name = sc.next(); // ID�� �̸��� �޽��ϴ�.
	    	if(ID.equals("0") && name.equals("0")) break; // ���࿡ 0�� 0�� �ԷµǾ��ٸ� ��� for���� ���������ϴ�.
	    	myMap.put(ID, name); // �׷��� �ʴٸ� ���� ���� map�� �߰��մϴ�.
	    }
	    
	    Set s = myMap.keySet(); // Ű �� ��Ʈ�� ����ϴ�.
	    Iterator<String> it = s.iterator(); // iterator �ν��Ͻ��� �����մϴ�.
	    
	    System.out.println("<�л����>");
	    System.out.printf("%-15s%-15s\n","[ID]","[NAME]");
	    while(it.hasNext()) {
	    	str = it.next(); // �Ʊ� ������ it ���ͷ����ͷ� ������ �о�ɴϴ�.
	    	System.out.printf("%-15s%-15s\n",str,myMap.get(str)); // ���ڰ� �ٸ��� ������ݴϴ�.
	    }
	    System.out.println("\n��ü �л� ��:"+myMap.size()); // �ʿ� ����ִ� ����� ������ ����մϴ�.
	    
	    Iterator<String> init_It = s.iterator(); // �ִ���ڼ��� �ּұ��ڼ� ������ �ʱ�ȭ �ϱ� ���� ���ͷ����͸� ���� �����մϴ�.
	    str = init_It.next();
	    int maxLength = myMap.get(str).length(), minLength = maxLength; // �ʱ�ȭ���ݴϴ�.
	    String maxID = str, minID = str;
	    
	    Iterator<String> real_It = s.iterator(); // ������ ���ؼ� ���� �����ϱ� ���� ���ͷ����͸� ���� �����մϴ�.
	    while(real_It.hasNext()) { // Map�� ó������ ������ �ݺ��մϴ�.
	    	str = real_It.next();
	    	if(maxLength<myMap.get(str).length()) { // maxLength�� ����ִ� ���� �ҷ��� ���� ������ �� �� �۴ٸ�,
	    		maxLength = myMap.get(str).length(); // ���� ��ü���ݴϴ�.
	    		maxID = str; // maxID���� ID���� str�� �������ݴϴ�.
	    	}
	    	if(minLength>myMap.get(str).length()) { // minLength�� ����ִ� ���� �ҷ��� ���� ������ �� �� ũ�ٸ�,
	    		minLength = myMap.get(str).length(); // ���� ��ü���ݴϴ�.
	    		minID = str; // minID���� ID���� str�� �������ݴϴ�.
	    	}
	    }
	    // ������ָ� �˴ϴ�.
	    System.out.println("<���� �� �̸��� ���� �л�>");
	    System.out.println("ID:"+ maxID +" Name:"+myMap.get(maxID)+" ����:"+maxLength);
	    System.out.println("<���� ª�� �̸��� ���� �л�>");
	    System.out.println("ID:"+ minID +" Name:"+myMap.get(minID)+" ����:"+minLength);	    
	    
	}

}
