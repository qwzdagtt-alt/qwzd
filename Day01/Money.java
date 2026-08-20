package Money;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액");
		//정수를 money변수로 변?환?
		int money = sc.nextInt();
		int coin500 = money / 500;
		// 500을 최소한으로 사용한
		int penny = money % 500;
		int coin100 = money / 100;
		//1400원에서 1000원을 빼고 거스름돈을 100원짜리로 나누는 법이 이해가 안갑니다 
		System.out.println("500원짜리" + coin500 + "개");
		
	}
}
