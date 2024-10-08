package chapter01;

public class E_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자
		System.out.println("===문자열 산술 연산자===");
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		System.out.println(10 / 20);   // 0 >> 나눈 결과의 몫을 저장
		System.out.println(21 / 10);  
		
		System.out.println(21 % 10);   // 1 >> 나눈 결과의 나머지를 저장 
		
		System.out.println("===증감 연산자===");
		int number = 10;
		System.out.println(number++);   // 10
		System.out.println(++number);   // 12
		System.out.println(++number);   // 13
		System.out.println(number++);   // 13
		System.out.println(number);     // 14
		
		System.out.println("===대입 연산자===");
		int num = 10;
		System.out.println(num += 3);
		System.out.println(num -= 3);
		System.out.println(num *= 3);
		System.out.println(num /= 3);
		System.out.println(num %= 3);
		
		System.out.println("===비교 연산자===");
		// : 좌항을 우항과 비교한 결과를 논리(true,false)값으로 반환
		// ==,!=,<,>,<=,>=
		
		// cf) 자바는 일치에 대한 연산이 ==(equal 2개)로 작성
		
		System.out.println("===논리 연산자===");
		// : 논리값 boolean 값을 연산
		
		// &&: and(논리곱)
		System.out.println(true && true);
		System.out.println(true && false);
		
		// ||: or(논리합)
		System.out.println(true || true);
		System.out.println(true || false);
		
		// !:not(부정논리)
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("==========");
		System.out.println(3 > 2 &&  1 == 1);
		System.out.println(1 != 1);
		
	   System.out.println("===조건 연산자===");
	   System.out.println(3 > 2 ? 10 : 20);
	   
	   int x = 10;
	   int y = 2;
	   System.out.println(x % y == 0 ? "2의 배수입니다" : "2의 배수가 아닙니다");
	   
	   System.out.println();
	   
	   
	   
	}

}
