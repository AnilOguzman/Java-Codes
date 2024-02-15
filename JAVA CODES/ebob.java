package ebob;

import java.util.Scanner;

public class ebob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number1= input.nextInt();
		System.out.println("Enter a number");
		int number2 = input.nextInt();
		gcd(number1,number2);
	}

		public static void gcd(int number1, int number2) {
			int a=0;
			for(int k=1;k<=number1 && k<=number2;k++) {
				if(number1%k==0 && number2%k==0) {
					a=k;
				}
			}
		System.out.println(a);
		}
	}
