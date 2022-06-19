package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers : ");
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		
		if (firstNum > secondNum) {
			System.out.println(String.format("%d is bigger", firstNum));
		} else
			System.out.println(String.format("%d is bigger", secondNum));
			
		scanner.close();
	}

}
