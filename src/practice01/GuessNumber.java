package practice01;

//[7/6] 문제 4번
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Random random = new Random();

		int number = random.nextInt(100);

		Scanner sc = new Scanner(System.in);

		int qNum = 1; // 문제 번호
		int minNum = 1; // 최소 숫자
		int maxNum = 100; // 최대 숫자

		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		System.out.println("1-100");

		while (true) {// 프로그램 종료시까지 무한루프
			System.out.print(qNum + ">>");// 문제번호 춮력
			qNum = qNum + 1;// 문제번호 증가
			int wNum = sc.nextInt();// 숫자입력
			if (wNum != number) {// 숫자가 정답과 다를 경우
				if (wNum < number) {// 숫자가 정답보다 작을 경우
					System.out.println("더 높게");
					minNum = wNum;// 최소 범위를 사용자 입력 숫자로 변경
					if (maxNum != 100)// maxNum의 값이 바뀌었을 때의 범위 출력
						System.out.println(minNum + "-" + maxNum);
					else// maxNum의 값이 바뀌지 않았을 때의 범위 출력
						System.out.println(minNum + "-100");
				} else {// 숫자가 정답보다 큰 경우
					System.out.println("더 낮게");
					maxNum = wNum;// 최대 범위를 사용자 입력 숫자로 변경
					System.out.println(minNum + "-" + maxNum);// 범위 출력
				}
			} else {// 정답을 맞춘 경우
				System.out.println("맞았습니다.");
				System.out.println("다시 하시겠습니까? (y/n) ");
				String answer = sc.next();// 프로그램 다시 시작 여부 입력
				if (answer.equals("y")) {// 다시 시작
					GuessNumber.main(args);
				} else if (answer.equals("n")) {// 종료
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {// 잘못된 값을 입력한 경우 프로그램 종료
					System.out.println("잘못된 값이 입력됐습니다.프로그램을 종료합니다.");
					break;
				}
			}
		}
	}
}