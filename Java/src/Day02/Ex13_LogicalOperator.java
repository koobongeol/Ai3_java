package Day02;

public class Ex13_LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //논리 연산자
		// AND 연산
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		
		//or (||)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		
	    // NOT	느낌표 반대로 ex트루를 폴스로 폴스를 트루로.
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		//쇼트 서킷
		// : 논리 연산의 결과를 미리 알아서 남은 논리식을 확인하지 않는것
		//둘다 트루여야 함
		int value1 = 3;
		System.out.println(false && ++value1 > 10);
		System.out.println("value1 :" + value1);
		
		int value2 = 3;
		System.out.println(true || ++value2 > 10);
		System.out.println("value2 : " + value2 );
		
		// 비트 연산자 경우 쇼트 서킷이 적용되지 않는다.
		
		int value3 = 3;
		System.out.println(false & ++ value3 >10);
		System.out.println("value4 : " + value3);
		
		int value4 = 3; 
		System.out.println(true | ++value4 >10);
		System.out.println("value4 : " + value4);
		
		int i = 10;
		int j = 2;
		System.out.println(i & j);
		System.out.println(i | j);
		
		
	}

}
