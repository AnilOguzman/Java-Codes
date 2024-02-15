package recursive;

import java.util.Scanner;

public class recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		System.out.println(basamaktoplamı(num));
		
	}
	private static int basamaktoplamı(int n) {
		int a=n%10;
		if(n!=0) 
			return a+basamaktoplamı(n/10);
		
		return 0;
	}
}