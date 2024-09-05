package chapter03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arrays 클래스
		// : 배열을 조작하는데 유용한 기능들을 제공
		// >> 정렬 검색 변환 등
		
		// java.util 패키지 내부에 포함
		// : Import 구문을 사용 
		
	// 1.Arrays 클래스 사용법
		int[] numbers = {3,2,5,4,1};
		
		// == 배열 정렬(오름차순)==
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
		
		// == 배열변환 ==
		// Arrays.toString();
		// >> 배열의 전체 구조를 파악할 수 있는 기능
		// >> 전체 배열을 대괄호 안에 담은 형태를 나타냄
		// >> 각 요소를 순회하며 문자열로 반
		System.out.println(Arrays.toString(numbers));
		
		// == 배열 내 검색 ==
		// Arrays.binarySearch(배열,검색내용)
		// >> 존재0 : 인덱스 번호 반환
		// >> 존재x : 음수 반환
		System.out.println(Arrays.binarySearch(numbers, 1));
		System.out.println(Arrays.binarySearch(numbers, 6));
		
		// ==  배열의 비교 ==
		// Arrays.equals (a배열,b배열)
		// >> 논리형태로 반환
		
		int[] number2 = {1,2,3,5,4};
		System.out.println(Arrays.equals(numbers, number2));
		
		// == 배열의 채움 ==
		// Arrays.fill(배열,삽입할 값);
		// >> 배열의 모든 요소를 특정 값으로 채움
		
		int[] example=new int[3];
		Arrays.fill(example, 10);
		
		System.out.println(Arrays.toString(example));
		
		
		
	}

}
