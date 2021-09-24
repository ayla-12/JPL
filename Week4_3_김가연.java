import java.util.Scanner;
public class Week4_3_김가연 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
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
		System.out.println("ca+cb="+sum(ca, cb)); // sum(‘a’, ‘b’)은 String “ab” 반환 
		System.out.println("sum of Int_Arr="+sum(iarr)); // 모든 원소의 합 
		System.out.println("sum of Double_Arr="+sum(darr)); // 모든 원소의 합 
		System.out.println("sum of Char_Arr="+sum(carr)); // 모든 문자 연결
	}

	//오버로딩을 위한 함수들
	static int sum(int a, int b){ return a+b; } // 정수와 정수를 더하는 sum 메서드
	static double sum(int a, double b) {return (double)a + b;} // 정수와 실수를 더하는 sum 메서드
	static double sum(double a, int b) {return a + (double)b;} // 실수와 정수를 더하는 sum 메서드
	static double sum(double a, double b){ return a+b; } // 실수와 실수를 더하는 sum 메서드
	static String sum(char a, char b) { // 문자와 문자를 합치는 sum 메서드
		String str1 = Character.toString(a); // 문자를 문자열로 바꾸어줘야 + 연산을 사용할 수 있습니다.
		String str2 = Character.toString(b); // 하나만 바꿔줘도 되지만 통일성을 위해 둘다 문자를 문자열로 바꿔줍니다.
		return str1+str2; // 그리고 리턴값을 + 연산으로 이어줍니다.
		}
	static int sum(int[] a) { // 정수 배열의 전체 합을 구하는 sum 메서드
		int result = 0; // 합이 저장되는 변수인 정수 result 변수를 선언해줍니다.
		for(int i = 0; i < a.length; i++) { // 배열의 길이인 a.length를 이용해 배열에 들어있는 정수의 값을 반복문을 통해 구해줍니다.
			result += a[i];
		}
		return result; // result에 값이 저장되어있으니 이를 리턴값으로 내놓습니다.
	}
	static double sum(double[] a) { // 실수 배열의 전체 합을 구하는 sum 메서드
		double result = 0; // 합이 저장되는 변수인 정수 result 변수를 선언해줍니다.
		for(int i = 0; i < a.length; i++) { // 배열의 길이인 a.length를 이용해 배열에 저장된 실수의 값을 반복문을 통해 구해줍니다.
			result += a[i];
		}
		return result; // result에 저장된 배열의 합을 리턴값으로 내놓습니다.
	}
	static String sum(char[] a) { // 문자 배열을 합쳐서 출력하는 sum 메서드
		String str=""; // 문자열 변수 str를 초기화해서 선언해줍니다.
		String strr[] = new String[a.length]; // 문자열 배열인 strr을 인자로 받는 배열 크기, 즉 a.length만큼 칸을 선언해줍니다.
		
		for(int i = 0; i < a.length; i++) {
			strr[i] = Character.toString(a[i]); //for 문을 이용해서 문자 배열 안에 있는 문자를 문자열로 변환해주고, 이를 새로운 문자열 배열에 저장합니다.
			str += strr[i]; // 그리고 그 문자열 배열안의 원소들을 문자열 변수인 str에 차곡차곡 쌓습니다.
		}
		
		return str; // for 문을 다 돌면 문자열 str이 완성되고, 이를 리턴합니다.
	}
	
	
	
	
	
	
}
