package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length and breadth (All units in mts)");
				
		int length = scanner.nextInt();
		int breadth = scanner.nextInt();
		int area = length*breadth;
		int perimeter = 2*(length+breadth);
		
		System.out.println(String.format("Area of rectangle = %d mts\nPerimeter = %d mts", area,perimeter));
		
		scanner.close();

	}

}
