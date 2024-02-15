package ekok;

import java.util.Scanner;

public class ekok {

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
			for(int k=1;k<=(number1*number2);k++) {
				if(k%number1==0 && k%number2==0 ) {
					a=k;
					break;
				}
			}
			System.out.println(a);
		
		}
	
	}


