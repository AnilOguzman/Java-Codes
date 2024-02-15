package findingprimefactors;

import java.util.Scanner;

public class findingprimefactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i=2;(number!=1);i++) {
			if(number %i == 0) {
				number=number/i;
				System.out.print(i + " ");
				i=1;
			}
		}
		
		 }
}
	


