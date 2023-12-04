package ch2_Operator;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
	
		/**
		 * 정수 하나를 입력 받아서 양수, 음수, 0인지를 출력.
		 
		 */
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("숫자를 입력하세요 : ");
	// score or num 둘 중 하나
	int score = scanner.nextInt();

	if (score == 0){
		System.out.println("0 입니다");
	}else if(score > 0){
		System.out.println("양수 입니다");
	}else {
		System.out.println("음수 입니다");
		}
	}
	//if num > 0 
	//else if  num < 0
	//else if num == 0 도 가능 
	
}
