package Day02;

public class Ex12_PlusMinusOperatoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c;
		//증감연산자
		//++a, a++ :a룰 1증가
		//--a, a-- :a를 1감소
		
		c = ++a + b;
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		int x = 10;
		int y = 20;
		int z;
		//전위연산자 : 연산자 우선순위가 가장 높다(++a,--a)
		//후위연산자 : 연산자 우선순위가 가장 낮다(a++,a--)
		

		z = x++ + y;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
	}

}
