package pascal;

import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		pascal(number);
	}
	public static void pascal(int k)
    {
        for (int line = 1; line <= k; line++) {
            for (int i = 0; i <= k - line; i++) {
                System.out.print(" ");
            }
            
            int constant = 1;
            for (int j = 1; j <= line; j++) {
               
                System.out.print(constant + " ");
                constant = constant * (line - j) / j;
            }
            System.out.println();
        }
}
}
