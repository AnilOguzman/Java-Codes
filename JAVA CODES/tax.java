package tax;

import java.util.Scanner;

public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter your annual income");
		Scanner input = new Scanner(System.in);
		double annualincome = input.nextDouble();
		double kdv = annualincome * 18 / 100;
		System.out.println("Tax:" + kdv );

	}

}
