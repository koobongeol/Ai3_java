package Day01;

import java.util.Scanner;

// import : 외부 클래스를 포함시키다
// import 패키지명.클래스명;

public class Ex02_Scanner {
     public static void main(String[] args) {
		
     }
	private Scanner sc;
    // main : ctrl + space
	//객체 생성 키워드 : new
	//클래스타입 객체명 = new 클래스명();
	//Scanner : 표준 입력 객체
	
	public Ex02_Scanner() {
	   //sc = new Scanner
	
	
	int a = sc.nextInt();
	System.out.println("a : " + a);
	
	// (에러) :빨간색 밑줄로 표시
	//       :에러가 발생하면, 프로그램 실행 불가
	// (경고) :노란색 밑줄로 표시
	//       :경고가 발생해도, 프로그램 실행 가능
	
	
	// close(): Scanner 객체를 메모리에서 해제하는 메소드
    //sc.close();
	 
//sc.nexint();
	//sc.close();
	
	}
}
	
      
      