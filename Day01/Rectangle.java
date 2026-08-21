package Rectangle;

import java.util.Scanner;

public class Rectangle {
	
	//직사각형의 가로와 세로를 키보드로 하나씩 입력받아 넓이를 구하는 프로그램
	public static void main(String[] args) {		
	    //가로 길이와 세로 길이를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("직사각형의 가로길이:");
		//소수점 이므로 double
		double width = sc.nextDouble();
		System.out.print("직사각형의 세로길이:");
		double length = sc.nextDouble();
		
		//넓이는 가로 곱하기 세로
		double area = width*length;
		
		System.out.print("직사각형의 넓이는" + area + "입니다");
		
	}
}
