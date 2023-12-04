//package ch2_Operator;
//
//public class ch2_ArithmeOperator {
//
//	public static void main(String[] args) {
//		
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(true || true);
//		
//		boolean bool1 = true;
//		boolean bool2 = false;
//		boolean bool3 = true;
//		
//		System.out.println(bool1 && bool2);
//		// bool2, bool3의 OR 연산 결과를 result 
//		//라는 변수에 담고 result 변수값 출력
//		System.out.println(bool2 || bool3);
//		boolean result = bool2 || bool3;
//		System.out.println(result);
//		
//		// num1, bum2 정수형 변수에 각각 10, 20을 대입하여 선언
//		
//		int A = B = 20;
//		
//		System.out.println(num1 + num);
//		
//		
//		boolean result1 = num1 > num2;
//		boolean result2 = num1 != num2;	
//		boolean result3 = result1 && result2;
//		System.out.println(result3);
//		
//		boolean result4 = (num1 > num2) && (num1 != num2);
//		System.out.println(result4);
//		
//		//(System.out.println();) <출력
//		
//		System.out.println(bool1); //t
//		System.out.println(!bool1); //f
//		System.out.println(bool1 && bool2); //f
//		System.out.println(!(bool1 && bool2)); //t
//		
//		System.out.println("Not 연산 수행 전 " + bool2);
//		bool2 = !bool2;
//		System.out.println("Not 연산 수행 후 " + bool2);
//	
//		
//		// 증감 연산자
//		
//		int num1 = 10, num2 = 0, num3 = 0;
//		System.out.println("num1 : " + num1 + "num2 : " + num2 + "num3 : " + num3);		
//		num2 = ++num1; //num2+num1
//		System.out.println("num1 : " + num1 + "num2 : " + num2 + "num3 : " + num3);	
//		num2 = ++num1; //12             11                 11      0        
//		num3 = num1++; // 계산을 먼저 하고, 1 값 추가
//		System.out.println("num1 : " + num1 + "num2 : " + num2 + "num3 : " + num3);	
//		
//		
//		int result1 = num1++ + ++num2;
//		System.out.println("num1 : " + num1 + "num2 : " + num2 + "num3 : " + num3);	
//		System.out.println(result1);
//		
//		
//		
//		
//		
////		int num1 = 10, num2 = 7;
////		System.out.println("num1 : " + num1 + "num2 :" + num2);
////		//대입 연산자 활용
////		
////		num1 += num2;
////		System.out.println("num1 : " + num1 + "num2 :" + num2); //num1 : , num2 : 17, 7
////		num1 += num2; //24,7
////		System.out.println("num1 : " + num1 + "num2 :" + num2);
////		num1 -= num2; //17,7
////		System.out.println("num1 : " + num1 + "num2 :" + num2);
////		num1 *= num2; //119,7
////		System.out.println("num1 : " + num1 + "num2 :" + num2);
////		num1 /= num2; //17,7
////		System.out.println("num1 : " + num1 + "num2 :" + num2);
////		num1 %= num2; //3,7
////		System.out.println("num1 : " + num1 + "num2 :" + num2);
////		
////		
////		System.out.println(10 > 5);
////		System.out.println(10 < 5);
////		boolean result = 77 <= 60;
////		System.out.println(result);
////		
////		
////		result = (8 == 100);
////		System.out.println(result);
////		result = true;
////		boolean bool1 = true;
////		result = bool1;
////		// 	result = bool1; 이 boolean bool1 = true;로 들어감
////		System.out.println(result);
////		System.out.println(bool1);
//		
//		
//		
//		//우변과 좌변의 값이 일치해야한다
//		
//		
//		
//		
//		
//		
////		int num1 = 5;
////		int num2 = 2;
////				
////		System.out.println("덧셈 결과 : " + (num1+num2));
////		System.out.println("뺄셈 결과 : " + (num1-num2));
////		System.out.println("곱셈 결과 : " + (num1*num2));
////		System.out.println("나머지 결과 : " + (num1%num2));
////		System.out.println("나누기 결과 : " + (num1/num2));
////		
////	
////		int result = 0;
////		result = num1+num2;
////		System.out.println(result);
////		result = num1-num2;
////		System.out.println(result);
////		result = num1*num2;
////		System.out.println(result);
////		result = num1/num2;
////		System.out.println(result);
////		result = num1%num2;
////		System.out.println(result);
////		
////		//계산 결과 변수를 따로 선언
////				int sumResult = num1+num2;
////				System.out.println(sumResult);
////				int subResult = num1-num2;
////				System.out.println(subResult);
////				int mulResult = num1*num2;
////				System.out.println(mulResult);
////				int divResult = num1/num2;
////				System.out.println(divResult);
////				int remainResult = num1%num2;
////				System.out.println(remainResult);
////						
////		
//	}
//}
//
