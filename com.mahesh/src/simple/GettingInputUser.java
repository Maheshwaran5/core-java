package simple;

import java.util.Scanner;

public class GettingInputUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your Name");
		String name = scanner.nextLine();
		System.out.println("Hello" + name);
		
		
		System.out.println("What is your Rating from 1 to 5");
		int rating = scanner.nextInt();
		System.out.println("You rated us" + rating);
		
	

	}

}
