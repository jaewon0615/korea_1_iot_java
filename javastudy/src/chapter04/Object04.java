package chapter04;

// 클래스 생성(book,person,...)
//: 속성 2개
//: 메서드 1개 
class Book {
	String name;
	String author;
	int year;

	void displayInfo1() {
		System.out.println("책 제목: " + name +  "저자: " + author + "발간년도: " + year);
	}
	
	// === 생성자 함수 ===
	// : new 연산자 사용 시 호출 될 메서드
	// >> 생략 시 속성에 기본값이 할당
	// 일반타입: int(0) boolean(false) char("")
	// 참조타입: null
	// >> 생략 시 클래스명과 동일하면서 매개변수가 없는 메서드
	

	Book(String name, String author, int year) {
		
		// this.클래스 속성 = 메개변수   
		this.name = name;
		this.author = author;
		this.year = year;

	}

}

public class Object04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 위에서 정의한 클래스를 사용하여 객체 인스턴스 화
		
		Book myBook = new Book("집에", "보내주세요", 2024);
		Book anotherBook =new Book("신데렐라", "플라", 2023);

		System.out.println(myBook.name);
		System.out.println(myBook.author);
		System.out.println(myBook.year);
		
		System.out.println(anotherBook.name);
		System.out.println(anotherBook.author);
		System.out.println(anotherBook.year);

		myBook.displayInfo1();
		anotherBook.displayInfo1();
		
		myBook.year =2019;
		myBook.displayInfo1();
		// 속성 출력

		// 메서드 호출

	}

}
