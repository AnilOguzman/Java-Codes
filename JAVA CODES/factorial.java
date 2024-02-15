package zzyeni;

import java.util.Scanner;

public class e {

	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a non-negative integer: ");
	    int n = input.nextInt();
	    
	    
	    System.out.println("Factorial of " + n + " is " + factorial(n));
	  }

	 
	  public static long factorial(int n) {
	    long a=0;
		  if (n == 0)                    //burasý aslýnda recersionun nerde duracaðýný belirtiyor.
	      return 1;
	    else
	    a =n * factorial(n - 1);            //buradaki recersion zaten bi önceki deðeri depoluyo yani n'i önce indirik 0a kadar baþladý artmaya
		  																																		
	    	return a;
	  }
	}