package chapter04;

// 클래스의 구조: 필드 메서드 생성자
class Car{
	String model;
	int year;
	
	// 클래스의 행동(메서드)
	// : 클래스 내부에서 정의된 함수 객체의 행동을 표현
	// >> 클래스의 데이터를 사용하여 특정 작업을 수행하거나
	//		, 해당 값을 변경 가능,값을 반
	
	// void : 해당 메서드의 반환하는 결과가 x
	// >> 반환(return)이 존재하지 않을 경우 메서드명 앞에 반드시 작성
	void displayInfo() {
		System.out.println("model:"+model+",year:"+year);
	}
	
	Car(String model,int year){
		// this 키워드
		// >> 클래스의 필드와 생성자로 받아오는 데이터의 이름이 같을 경우 구분을 위해 사용
		this.model= model;
		this.year = year;
	}
}

public class Object03 {
	public static void main(String[] args) {
		// 객체 생성(객체 인스턴스 화)
		// : new 연산자를 사용
		// : 클래스의 생성자를 호출- 객체의 초기 상태를 설정
		
		// 클래스명의 클래스의 새로운 객체를 생성
		// 해당 객체에 대한 참조(주소)를 클래스 타입의 변수에 저장 
		Car myCar = new Car("volvo xc60",2024);
		
		// 객체 사용
		// 1.필드 접근(.연산자)
		System.out.println(myCar.model);
		System.out.println(myCar.year);
		
		// 2.메서드 호출(.연산자)
		myCar.displayInfo();
		
		// == 객체 생성 구문 ==
		// 클래스명 객체명 = new 클래스명(생성자 매개변수);
		
		// cf) 클래스명 타입
		// 지정된 클래스를 기반으로 생성된 객체임으로 클래스 자체의 타입을 지님
		
		
		
	}

}
