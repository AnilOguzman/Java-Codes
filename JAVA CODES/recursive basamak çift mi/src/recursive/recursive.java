package recursive;

import java.util.Scanner;

public class recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		System.out.println(NumberofEvenDigits(num));
		
	}
	private static int count =0;
	private static int NumberofEvenDigits(int n) {
		int a=n%10;
		if(a%2==0) {
			count++;
			n=n/10;
		}
		else
			n=n/10;
		if(n!=0)
		NumberofEvenDigits(n);
		return count;
	}
}
