package pyramid;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int a = number;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=a;k++) {
				System.out.print("*"+" ");
			}
			System.out.println(" ");
			a--;
		}
		
		a=2;
		for(int i=number-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=a;k++) {
				System.out.print("*"+" ");
			}
			System.out.println(" ");
			a++;
		}
		
	}

}
