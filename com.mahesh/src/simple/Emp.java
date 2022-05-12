package simple;

import java.util.Scanner;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner o= new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=o.next();
		
		System.out.println("Enter the Emp id");
		int id=o.nextInt();
		
		System.out.println("Enter the Company");
		String company=o.next();
		
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(company);
		
		
		
	}

}
