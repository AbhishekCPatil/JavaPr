package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class BiggerNumOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if(n1 != n2) {
			if (n1 > n2) {
				System.out.println(String.format("%d is bigger", n1));
			} else
				System.out.println(String.format("%d is bigger", n2));
		}
		else
			System.out.println("Please enter different numbers.");
		
		scanner.close();
	}

}
