import java.util.Scanner;
public class Week4_3_�谡�� {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
		
		int a = 5, b = 10;
		double da = 3.4, db = 5.2;
		char ca = 'a', cb = 'b';
		int iarr[] = {1,2,3};
		double darr[] = {1.1, 2.2, 3.3};
		char carr[] = {'a','p','p','l','e'}; 
		System.out.println("a+b="+sum(a, b)); 
		System.out.println("da+b="+sum(da, b)); 
		System.out.println("a+db="+sum(a, db));
		System.out.println("da+db="+sum(da, db)); 
		System.out.println("ca+cb="+sum(ca, cb)); // sum(��a��, ��b��)�� String ��ab�� ��ȯ 
		System.out.println("sum of Int_Arr="+sum(iarr)); // ��� ������ �� 
		System.out.println("sum of Double_Arr="+sum(darr)); // ��� ������ �� 
		System.out.println("sum of Char_Arr="+sum(carr)); // ��� ���� ����
	}

	//�����ε��� ���� �Լ���
	static int sum(int a, int b){ return a+b; } // ������ ������ ���ϴ� sum �޼���
	static double sum(int a, double b) {return (double)a + b;} // ������ �Ǽ��� ���ϴ� sum �޼���
	static double sum(double a, int b) {return a + (double)b;} // �Ǽ��� ������ ���ϴ� sum �޼���
	static double sum(double a, double b){ return a+b; } // �Ǽ��� �Ǽ��� ���ϴ� sum �޼���
	static String sum(char a, char b) { // ���ڿ� ���ڸ� ��ġ�� sum �޼���
		String str1 = Character.toString(a); // ���ڸ� ���ڿ��� �ٲپ���� + ������ ����� �� �ֽ��ϴ�.
		String str2 = Character.toString(b); // �ϳ��� �ٲ��൵ ������ ���ϼ��� ���� �Ѵ� ���ڸ� ���ڿ��� �ٲ��ݴϴ�.
		return str1+str2; // �׸��� ���ϰ��� + �������� �̾��ݴϴ�.
		}
	static int sum(int[] a) { // ���� �迭�� ��ü ���� ���ϴ� sum �޼���
		int result = 0; // ���� ����Ǵ� ������ ���� result ������ �������ݴϴ�.
		for(int i = 0; i < a.length; i++) { // �迭�� ������ a.length�� �̿��� �迭�� ����ִ� ������ ���� �ݺ����� ���� �����ݴϴ�.
			result += a[i];
		}
		return result; // result�� ���� ����Ǿ������� �̸� ���ϰ����� �������ϴ�.
	}
	static double sum(double[] a) { // �Ǽ� �迭�� ��ü ���� ���ϴ� sum �޼���
		double result = 0; // ���� ����Ǵ� ������ ���� result ������ �������ݴϴ�.
		for(int i = 0; i < a.length; i++) { // �迭�� ������ a.length�� �̿��� �迭�� ����� �Ǽ��� ���� �ݺ����� ���� �����ݴϴ�.
			result += a[i];
		}
		return result; // result�� ����� �迭�� ���� ���ϰ����� �������ϴ�.
	}
	static String sum(char[] a) { // ���� �迭�� ���ļ� ����ϴ� sum �޼���
		String str=""; // ���ڿ� ���� str�� �ʱ�ȭ�ؼ� �������ݴϴ�.
		String strr[] = new String[a.length]; // ���ڿ� �迭�� strr�� ���ڷ� �޴� �迭 ũ��, �� a.length��ŭ ĭ�� �������ݴϴ�.
		
		for(int i = 0; i < a.length; i++) {
			strr[i] = Character.toString(a[i]); //for ���� �̿��ؼ� ���� �迭 �ȿ� �ִ� ���ڸ� ���ڿ��� ��ȯ���ְ�, �̸� ���ο� ���ڿ� �迭�� �����մϴ�.
			str += strr[i]; // �׸��� �� ���ڿ� �迭���� ���ҵ��� ���ڿ� ������ str�� �������� �׽��ϴ�.
		}
		
		return str; // for ���� �� ���� ���ڿ� str�� �ϼ��ǰ�, �̸� �����մϴ�.
	}
	
	
	
	
	
	
}
