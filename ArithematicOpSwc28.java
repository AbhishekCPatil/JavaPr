package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class ArithematicOpSwc28 {

	public static void main(String[] args) {
		int result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println("Enter an Arithematic Operator.");
		char operator = scanner.next().charAt(0);
		
		switch (operator)
		{
		case '+' : result = num1+num2;
				System.out.println(String.format("Sum = %d ", result));
				break;
		case '-' : result = num1-num2;
				System.out.println(String.format("Difference = %d ", result));
				break;
		case '/' : result = num1/num2;
				System.out.println(String.format("Quotient = %d ", result));
				break;
		case '%' : result = num1%num2;
				System.out.println(String.format("Remainder = %d ", result));
				break;
		case '*' : result = num1*num2;
				System.out.println(String.format("Product = %d ", result));
				break;
				
		default : System.out.println("Invalid arithematic operator");
		}
		scanner.close();

	}

}
