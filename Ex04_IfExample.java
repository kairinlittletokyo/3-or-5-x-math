package ch2_Operator;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * 중첩 if문을 적용한 학점 출력
 * 100점 초과나 0점 미만 입력범위 초과
 * 각 조건마다 학점값 출력 X
 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		// if (score <= 100 && score >= 0) 
		if (score > 100 || score < 0) {
			System.out.println("입력 범위를 초과하였습니다.");
		
		} else {
			
			String seongjeok = "";
			
			if (score >= 90) {
				seongjeok = "A";
				
			}else if (score >= 80 ) {
				seongjeok = "B";
				
			}else if (score >= 70 ) {
				seongjeok = "C";
				
			}else if (score >= 60 ) {
				seongjeok = "D";
				
			}else {
				seongjeok = "No human";
			
			}
			System.out.println(seongjeok);
		}
	}

}
