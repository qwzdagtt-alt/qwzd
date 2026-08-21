package Number;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int number = sc.nextInt();
		String result= (number%2==0)? "짝수":"홀수";
		
		System.out.print("짝수");
		
	}

}
