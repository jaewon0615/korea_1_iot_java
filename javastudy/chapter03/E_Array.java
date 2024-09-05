package chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList 생성
		// : 문자열(String)
		ArrayList<String> items = new ArrayList<String>();
		items.add("사과");
		items.add("연필");
		items.add("책");
		items.add("시계");
		items.add("텀블러");

		// 난수를 생성하는 random 기능
		// >> 무작위의 실수
		Random random = new Random();

		// 0번째 인덱스 부터 마지막 요소의 인덱스까지의 수 중에서 무작위 수를 생성
//		random.nextInt(숫자값);

		// >> 0부터 해당 숫자 미만의 정수가 생성

		String seletedItem = items.get(random.nextInt(items.size()));
		Scanner sc = new Scanner(System.in);

		String userGuess;

		while (true) {
			System.out.println("아이템을 찾아보세요");
			userGuess = sc.nextLine();

			if (userGuess.equals(seletedItem)) {
				System.out.println("정답입니다");
				break;

			} else if (userGuess == "종료") {
				break;
				
			} else {
				System.err.println("틀렸습니다 다시 시도하세요");
			}
		}
		sc.close();
		System.out.println("시스템이 종료되었습니다");

	}

}
