package chapter03;import java.io.InterruptedIOException;

// 배열
// 같은 타입의 여러 변수를 하나의 집합으로 묶어서 처리하는 구조
// 데이터를 연속적으로 저장
// 순서 o   (index번호 0부터 1씩 증가되는 값)
// 중복 o   

public class A_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 vs 변수
		// 배열은 생성한다 >> New 연산자를 사용
		// 변수는 선언한다

		// 1) 변수
		int korean = 90;
		int math = 75;
		int english = 80;

		// 2) 배열
		// : 생성하여 사용 - new 연산자

		// ====배열의 선언====
		// : 생성한 배열을 담을 그릇
		// >> 데이터 타입 [] 배열명;
		// >> 데이터 타입 배열명[];

		int[] array; // 정수형의 데이터를 담을 수 있눈 배열

		// ===배열의 생성===
		// 실제 데이터가 저장되는것이 아니라 데이터 배열이 저장된 첫 번째 메모리 주소가 저장
		// >> new 데이터 타입[배열의 길이];
		array = new int[3];
		System.out.println(array);

		// ===배열의 요소에 접근===
		// 배열명[인덱스번호] = 데이터;
		// 데이터 변경(삽입):배열명[인덱스번호] = 데이터;

		// cf) 배열 생성 시 모든 요소는 해당 데이터 타입의 기본값으로 초기화
		// 숫자(0),문자열(''),논리형(false)
		array[0] = 123;
		array[1] = 456;
		array[2] = 789;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);

//		System.out.println(array[3]);
		
		// ===배열의 선언과 동시에 초기화===
		// : new 연산자를 사용한 배열 생성 시 길이 지정을 하지 않는
		
		// a.데이터 타입[]배열명 = new 데이터 타입[]{요소1,요소2,요소3,...}
		int[] scoreList = new int [] {90,85,100};
		
		// b.데이터 타입[]배열명 ={요소1,요소2,요소3,...}
		char[]greet = {'h','e','l','l','o'};
		System.out.print(greet[0]);
		System.out.print(greet[1]);
		System.out.print(greet[2]);
		System.out.print(greet[3]);
		System.out.println(greet[4]);
		
		// 생성 시 요소의 개수를 파악하여 배열의 길이를 자동 지정 
//		System.out.print(greet[5]);
		
		// ===배열의 길이===
		// .length속성으로 확인
		System.out.println(greet.length);
		
		// === 배열의 특징 ===
		// >> 한 번 생성되면 크기 변경 x
		// >> 참조 타입: 주소값이 저장 
		// >> 모든 요소는 같은 자료형이어야 함 
		
		// === 문자열 배열 생성 ===
		// String 타입의 기본값은 null
		String[] fruits = new String[3];
		System.out.println(fruits[0]);
		
		fruits[0] = "사과";
		System.out.println(fruits[0]);
		
		// === 배열 요소 삭제 ===
		// : 삭제 기능을 담당하는 문법 x
		// >> 삭제할 요소를 제외한 나머지 요소를 새로운 배열로 복사 
		int[] oringinal = {1,2,3,4};
		int removeIndex = 2;   // 제거할 요소의 인덱스 번호 
		int originalLength = oringinal.length;
		
		int[] result = new int[originalLength -1];
		
		int k = 0;   // 새로운 배열의 인덱스 번호 
		for(int i = 0; i<originalLength; i++) {
			if(i == removeIndex) {
				continue;
			}
			result[k++] = oringinal[i];
		
		}
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		
		// === 배열을 순회하는 향샹된 for 문 forEach문 ===
		// for(데이터 타입 변수명: 해당 데이터 타입의 배열) {
		//      배열의 모든 요소에 접근하는 코드 
		//}
		
		int[] arrayNumber= {1,3,5,7,9};
		for(int number:arrayNumber) {        // number 변수 : for 문 내의 변수 
			System.out.println(number);
			
		}
		
		
		
		
		
		
	}

}
