package chapter05;

class Example{
	// (인스턴스) 변수 선언
	// : 데이터 타입이 같은 경우 타입 생략 가능 
	int x,y;
	// int x;
	// int y;
	
	// add메서드
	int add(int x,int y) {
		return x + y;
	}
	
	// multiply 메서드
	int multuply(int x , int y) {
		return x * y;
	}
	
	// 매개변수 x 반환값 x
	void print99dan() {
		for(int i =1; i < 8; i++) {
			for(int j=0; j<8; j++) {
				System.out.println(j*i+" ");
			}
			System.out.println();
		}
	}
}
// class 파
public class Method02 {
	
	// main 메서드
	// 접근 제어자 정적메서드 반환타입 메서드명(매개변수){...구현부}
	public static void main(String[] args) {
		
		Example ex1=new Example();
		
		ex1.print99dan();
		
//		ex1.add(10, 20,30);   error
//		ex1.add("20", "200")  error
		
		//char(2) 타입 >> int타입(4) : 자동 형 변환
		ex1.add('a','b');
		
		System.out.println(ex1.multuply(10, 20));
		
		
	
	}

}
