package Swap;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// 숫자 2개를 입력받고
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 a에 넣을 숫자 입력:");
		int a = sc.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력:");
		int b = sc.nextInt();
		
		// 숫자 2개를 swap
		int temp;
		temp =a;
		a = b;
		b = temp;
		
		//결과 출력
		System.out.print("Swapping 결과> a =" + a + " =b" + b);		
		
	}
}
