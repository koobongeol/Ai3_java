package Day02;

public class Ex14_BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AND
		
		//Integer.tBinaryString():십ㅂ진수를 이진수 문자열로 변환하는메소드
		
		int result = 20 & 16;
		System.out.println("20 & 16 = " + result);
		System.out.println( Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		

		
		// or
		int result2 = 20 | 16;
		System.out.println("20 | 16 = " + result2);
		System.out.println( Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		//XOR 
		//: 서로 값이 다르면 1(TRUE) 다르면 0 (flase)
		int result3 = 20 ^ 16;
		System.out.println("20 ^ 16 = " + result3);
		System.out.println( Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
		
		//왼쪽 시프트 연산 (<<)
		int a = 5;
		int result4 = a <<1;
		System.out.println(result4);
		
		//오른쪽 시프트 연산 (<<)
        int b = 10;
        int result5 = b>>2;
		System.out.println(result5);
		
	}

}
