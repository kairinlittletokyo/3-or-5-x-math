package ch2_Operator;

import java.util.Scanner;

public class Ex06_IfExample {
	public static void main(String[] args) {
		
		/** 정수 하나 입력, 
		 * 3의 배수인지 5의 배수인지 35의 공배수인지, 아무것도 아닌지를 출력
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		
		int num = scanner.nextInt();
		
		if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("공배수 입니다.");

		}else if (num % 5 == 0) {
			System.out.println("5의 배수 입니다");
			
		}else if (num % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}else {
			System.out.println("응 아니야");
		}
	
		
				
	}
}
