package chap04.q1;

import java.util.Scanner;

/**
 * packageName : chap04.q1
 * fileName : IntStackTesterEx
 * author : 최아리
 * date : 2022-11-01
 * description : 연습문제 Q1
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 */
// 연습4-1
// int형 고정 길이 스택의 사용 예(IntStack클래스의 모든 메서드 를 사용)
class IntStackTesterEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);	// 최대 64개를 푸시할 수 있는 스택

		while (true) {
			System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 푸시 (2) 팝 (3) 피크 " +
											 "(4) 덤프 (5) 검색 (6) 비움 " +
											 "(7) 출력 (0) 종료 : ");

			int menu = stdIn.nextInt();
			if (menu == 0) break; // 0아면 종료

			int x;
			switch (menu) {
			 case 1: 								// 1) 푸시
				System.out.print("데이터 : ");
				x = stdIn.nextInt();
				try {
					s.push(x);
			 	} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 								// 2) 팝
				try {
			 		x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 								// 3) 피크(꼭대기에 있는 데이터를 들여다봄)
				try {
			 		x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4:								// 4) 덤프 -> 차례대로 데이터 정보 출력
				s.dump();
				break;

			 case 5:								// 5) 검색
				System.out.print("검색할 데이터 : ");
				x = stdIn.nextInt();
				int n = s.indexOf(x); // x값이 포함되어있는지 없는지 확인
				if (n >= 0) // 스택에 데이터가 있으면
					System.out.println("꼭대기에서 " + (s.size() - n) +"번째에 있습니다.");
				else
					System.out.println("그 데이터가 없습니다.");
				break;

			 case 6:								// 6) 비웁니다
				 s.clear();
				 break;

			 case 7:								// 7) 데이터 출력
				System.out.println("용량 : " + s.getCapacity());
				System.out.println("데이터수 : " + s.size());
				System.out.println("비어 " + (s.isEmpty()  ? "있습니다."
														: "있지 않습니다."));
				System.out.println("가득 " + (s.isFull() ? "차 있습니다."
														: "차 있지 않습니다."));
				break;
			}
		}
	}
}
