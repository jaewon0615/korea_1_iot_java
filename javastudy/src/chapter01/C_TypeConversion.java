package chapter01;

// 자바 형 변환
// 하나의 타입을 다른 타입으로 바꾸는 것

// 자료형의 크기에 따른 형 변환 규칙 
// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

// cf) 메모리 설계 상 정수 타입 보다 실수 타입이 더 크다

public class C_TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.자동 형 변환 (묵시적)
		// : 크기가 큰 자료형의로의 변환
		byte smallBowl = 10;
		int bigBowl = 10000;
		
		// 작은 범위의 타입을 큰 타입으로 넣을 때는
		// 컴파일러가 자동으로 형 변환을 수
		bigBowl = smallBowl;
		
		byte a = 32;
		short b = a;
		int c = b;
		long d  = c;
		
		float e = d;  // 실수는 정수 자료형보다 크다
		
		// 2.강제 형 변환(명시적)
		// : 크기가 작은 자료형으로의 변환
		int number = 1234;
		float fNumber = number;   // 각 손실이 일어나지X
		
		float fNumber1 = 3.14f;
//		int number2 = fNumber1;   실수를 정수로 타입 변환 시 오
		
		// 강제 형 변환 방법
		// (작은 변환 자료형) 큰데이터값;
		int number2 = (int)fNumber1;
		
		// 실수를 정수로 변환 시 소수점 이하의 데이터가 버려짐 
		System.out.println(number2);
		
		// >> char 자료형의 형 변환 (char : 2byte)
		
		char a1 = 'a';   // 일반 문자값 
		char a2 = 97;    // 아스키코드값 
		char a3 = '\u0061';  // 유니코드값
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		int num97 = 97;
		System.out.println(num97);
		
		char example = '가';
		System.out.println((int)example);
		System.out.println((int)example +1);
		System.out.println((char)((int)example +1));
		
		// cf) char 자료형은 음수 표현식x
		
		long l1 = 123456;
		int i1 = (int)l1;
		short s1 = (short)i1;
		byte b1 = (byte)s1;
		System.out.println(b1);
		
		
	}

}
