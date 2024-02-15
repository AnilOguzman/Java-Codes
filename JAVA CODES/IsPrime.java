package deneme;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		boolean x=prime(num);
		System.out.println(x);

	}
public static	boolean prime(int sayi) {
		
		if(sayi==2) {
			return true;
			
		}
	        
	    for(int i=2;i<(sayi/2)+1;i++) {
	    	if(sayi%i==0) {
	    		return false;
	    	} 
	}
		return true;
	}
}
