package Day02;

public class Ex01_Variable {

	public static void main(String[] args) {
		// 변수 선언
		// - 자료형 변수명;
		
		// 변수 선언 및 초기화 
		// - 자료형 변수명 = 값;
		
		// 변수 선언
		int x;                 // int 형 변수 x 선언
		int y;                 // int 형 변수 y 선언
		
		// 여러 변수 동시 선언
		int a, b;
		
		// = (대입 션산자)
		x = 100;
		y = 200;
		
		// x + y
		// x, y : 피연산자
		//+     : 연산자
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		// 합계
		System.out.println("x + y" + (x+y));
		//합계 
		//(평균) = (합계) / (개수)
		System.out.println("(x+ y) / 2 =" + ((x+y) /2));
		
		
	}
    //    	
}
