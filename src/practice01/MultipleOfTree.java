package practice01;

// [7/6] 문제 1번 
import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");

		int num = scanner.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}else{
			System.out.println("3의 배수가 아닙니다.");
		}
	}
}