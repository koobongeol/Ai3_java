package Day02;

import java.util.Scanner;
public class Ex09_Circle {
// 한꺼번에 import :ctrl + shift + o

	public static void main(String[] args) {
		//상수
		// 프로그램 실행 동안 값을 변경하지 않고 사용할 값
		// 상수 선언 시, 반드시 값을 초기화해야한다
		// 선언 후에 값을 변경하면 에러가 발생한다
		// 키워드 : final
		
		
		final double PI = 3.131592;
		//에러 PI= 3.14;
		Scanner sc = new Scanner(System.in);
		//원의 넓이 
		// (넓이)= 원주욜* 반지름 ^2
		//   = 파이^2
		System.out.println("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius;
		System.out.println("원의넓이 : " + area);
		sc.close();
		
	}
	
}
