package zzyeni;
import java.util.*;
public class a {

	  public static void main(String[] args) {
		  
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter an index for a Fibonacci number: ");
		    int index = input.nextInt();

		    
		    System.out.println("The Fibonacci number at index "  
		      + index + " is " + fib(index));
		  }

		 
		  public static long fib(long index) {
		    long a=0;
		    long b=0;
		    long c=0;
			  if (index == 0) 
		      return 0;
		    else if (index == 1) 
		      return 1;
		    else 
		      a=fib(index - 1);
		      b=fib(index - 2);
		      c=a+b;
		      return c;
		  }
		}