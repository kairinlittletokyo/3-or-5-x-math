package ch2_Operator;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {

		/**
		 * 서로 다른 정수 3개를 입력 받아서, 가장 큰 정수 출력하기 (같은 숫자는 입력하지 않는다고 가정) 입력 예 첫 번째 숫자 : 두 번째
		 * 숫자 : 세 번째 숫자 :
		 * 
		 * 출력 예 가장 큰 숫자는 00 입니다.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = scanner.nextInt();
		System.out.println(num1);

		scanner.nextLine();

		System.out.print("두 번째 숫자 : ");
		int num2 = scanner.nextInt();
		System.out.println(num2);

		scanner.nextLine();

		System.out.print("세 번째 숫자 : ");
		int num3 = scanner.nextInt();
		System.out.println(num3);

		int An = 0;
		

		if (num1 > num2 && num1 > num3) {
			An = num1;
		} else if (num2 > num1 && num2 > num3) {
			An = num2;
		} else if (num3 > num1 && num3 > num2) {
			An = num3;
		}
		System.out.println("가장 큰 값은" + An + "입니다.");

	}
}
