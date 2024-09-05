package chapter02;

import java.util.Scanner;

public class E_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean isRun = true;

		System.out.println("프로그램 시작");

		while (isRun) {
			System.out.println("[회원조회]");
			System.out.println("1.회원번호로 조회");
			System.out.println("2.회원 이름으로 조회");
			System.out.println("b.뒤로가기");

			System.out.print("메뉴 선택: ");

			// .nextLine(); : 개행 문자 까지 처리
			String selectedMenu = sc.nextLine();

			switch (selectedMenu) {
			case "1":
				System.out.println("회원 등록 기능입니다");
				break;
			case "2":
				System.out.println("회원 조회 기능입니다");
				boolean isRunMenu2 = true;
				while(isRunMenu2) {
					System.out.println("[회원조회]");
					System.out.println("1.회원번호로 조회");
					System.out.println("2.회원 이름으로 조회");
					System.out.println("b.뒤로가기");
		
				
				}
				break;
			case "3":
				System.out.println("회원 탈퇴 기능입니다");
				break;
			case "q":
				System.out.println("프로그램을 종료합니다");
				isRun=false;
				break;
			default:
				System.out.println("잘못된 입력입니다.다시 입력하세요");

			}
		}
				System.out.println("프로그램 종료");
	}

}
