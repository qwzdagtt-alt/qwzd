package Switch01;

import java.util.Scanner;

public class Switch01 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//숫자를 입력 받아 짝수인지 홀수인지 출력
		System.out.print("숫자를 입력하세요");
		int number = sc.nextInt();
		switch (number % 2) {
		case 0: //나머지가 0인 경우
			System.out.println("짝수입니다");
			break;
		case 1://나머지가 1인 경우
			System.out.println("홀수입니다");
			break;
		}

   }
}