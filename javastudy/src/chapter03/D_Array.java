package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바의 기본 배열 형태
		// : 한 번 생성되면 크기 변경 x
		// >> 변경 시 새로운 배열 생성하여 원래 배열 요소 복사
		
		int[]numbers =new int[5];
		System.out.println(Arrays.toString(numbers));
		
		// == 동적 배열 == (ArrayList) 사용법
		// : 자바의 Array:ist 라이브러리의 기능
		// :java.utils.ArrayList를 import해서 사용
		
		// cf) 동적 배열의 경우 배열의 타입 지정 시 일반 데이터 타입 x , 참조 타입으로 작성
		// int >> Integer
		// char >> Charactor
		// boolean >> Boolean
		// String
		
		// +) 참조 타입은 기본값이 모두 null 
		//[null.null.null,...]
		
		
		// +) 기본 타입은 null값을 가질 수 x >> int a = null; 
		
		Integer a =123;
		System.out.println(a);
		
		// == ArrayList<데이터타입> 배열명= new ArrayList<>(선택);
		// >> 소괄호 안의 선택값은 초기용량을 설정 
		// 		: 지정하지 않을 경우 기본 용량 10 
		
		ArrayList<Integer> arrayList =new ArrayList<>(20);
		System.out.println(arrayList);
		
		// == ArrayList 데이터 추가 == 
		// : 해당 리스트(배열)의 마지막에 값을 추가
		// : 배열명.add (추가할 데이터)
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList);
		
		// == ArrayList 데이터 변경 ==
		// : 배열명.set(인덱스 번호, 변경할 데이터);
		arrayList.set(1, 50);
		System.out.println(arrayList);
		
		// == ArrayList 데이터 삭제  ==
		// 배열명.remove(인덱스번호)
		arrayList.remove(2);
		System.out.println(arrayList);
		
		// == ArrayList 크기 확인 ==
		// 배열명.size();
		
		System.out.println(arrayList.size());
		
		// == 원하는 위치에 데이터 삽입
		// 배열명.add(인덱스 번호,데이터값;
		arrayList.add(1,123);
		System.out.println(arrayList);
		
		// == 특정 요소 접근 ==
		// 배열명.get
		System.out.println(arrayList.get(1));
		
		
		
		
		
		
		
		
		
	}

}
