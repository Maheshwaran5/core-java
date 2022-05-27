package simple;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("Your are a Major");

		} else {
			System.out.println("You are a Minor");
		}

	}

}
