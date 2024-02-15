package GcdRecursive;

import java.util.Scanner;

public class testGcdRecursive {

	/**
	 * (Compute greatest common divisor using recursion) The gcd(m, n) can also
	 * be defined recursively as follows:
	 * ■ If m % n is 0, gcd(m, n) is n.
	 * ■ Otherwise, gcd(m, n) is gcd(n, m % n).
	 
	 */
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        System.out.println("The GCD of " + number1 + " and " + number2 + " is " + gcd(number1, number2));

    }

    private static int gcd(int number1, int number2) {
        if (number1 % number2 == 0) {
            return number2;
        }
        return gcd(number2, number1 % number2);
}
}
