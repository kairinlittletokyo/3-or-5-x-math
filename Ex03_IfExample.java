//package ch2_Operator;
//
//import java.util.Scanner;
//
//public class Ex03_IfExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		/**
//		 * 스캐너로 점수(Score)를 하나 입력받아서
//		 * 90 A
//		 * 80 B
//		 * 70 C
//		 * 60 D
//		 * 60보다 작으면 F
//		 */
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("점수를 입력하세요 : ");
//		int score = scanner.nextInt();
//		if (score >= 90) {
//			System.out.println("A 입니다.");
//		}else if (score >= 80 ) {
//			System.out.println("B 입니다.");
//		}else if (score >= 70 ) {
//			System.out.println("C 입니다.");
//		}else if (score >= 60 ) {
//			System.out.println("D 입니다.");
//		}else {
//			System.out.println("F 입니다.");
//		}
//		
//	}
//
//}