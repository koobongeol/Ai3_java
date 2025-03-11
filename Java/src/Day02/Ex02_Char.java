package Day02;

public class Ex02_Char {
	
	public static void main(String[] args) {
		//문자 데이터 : char
		// 작은 따옴표 '를 한 글자의 문자를 표현
		//리터럴(Literal)
		char c1 = 'a';
		char c2 = 65;
		char c3 = '\u0041';
		
				
				
		char c4 = '가';		
		char c5 = 44032;
		char c6 = c1;
		
		//char b = c2 + 1
		char b = (char) (c2 + 1);
		//작은 자료형과 큰 자료형을 연산하면, 그 결과는 큰 자료형이 된다.
		// (작은 자료형) + ( 큰 자료형)= (큰 자료형)
		// ( c2 + 1)        : (char) + (int) + (int) 
		// b =(c2 + 1 )     : (char) = char) (int)  강제 형변환
		
		
		System.out.println("c1 : + c1");
		System.out.println("c2 : + c2");
		System.out.println("c3 : + c3");
		System.out.println("c4 : + c4");
		System.out.println("c5 : + c5");
		System.out.println("c6 : + c6");
		System.out.println("A의 코드값 : + ubicode");
		System.out.println("b : + b");
		
	}

}
