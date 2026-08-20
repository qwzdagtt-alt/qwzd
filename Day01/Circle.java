package Circle;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		// Scanner 만들기 -> sc
		Scanner sc = new Scanner(System.in);
		// 콘솔에 출력하는 글자 입력받는 코드가 아님.
		System.out.println("원의 반지름을 입력하세요");
		// 실제로 입력받을 숫자 코드 적기
		double r = sc.nextDouble();
		final double PI = 3.14;
		double circle = r*r*PI;
		System.out.print("원의 넓이는" + circle +"입니다");
		
	}

}
