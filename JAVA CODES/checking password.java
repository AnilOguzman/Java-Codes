package zzassignment;
import java.util.Scanner;
public class abd {

	public static void main(String[] args) {
	System.out.println("Please enter a valid password following these rules: ");
	System.out.println("1. A password must have at least eight characters.");
	System.out.println("2. A password must consists of only letters and digits.");
    passwordchecker();
	}
	public static void passwordchecker() {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a password now: ");
		if  (input.hasNext("[A-za-z012456789]*")) {
		 String password= input.nextLine(); 
			 if (password.length()>=8) {
				 System.out.println("Valid password type!");
				 }
			 else
				 System.out.println("Password must have at least eight characters!");
}
		else {
			System.out.println("Invalid!");
		}

		 
	}
}
