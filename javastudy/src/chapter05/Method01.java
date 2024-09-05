package chapter05;


class Calculator{
	// 계산기의 덧셈 기능
	int addNumbers(int a,int b) {
		int sum =a+b;
		String name="이승아";
		return sum;
	}
}

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메서드 사용
		// >> 해당 메서드가 정의된 클래스의 객체를 생성 
		// >> .연산자를 사용하여 호출
		Calculator calc=new Calculator();
		System.out.println(calc.addNumbers(10, 20));
		int result=calc.addNumbers(20, 40);
		int result2=calc.addNumbers(50, 321);
		System.out.println(result);
		System.out.println(result2);

	}

}
