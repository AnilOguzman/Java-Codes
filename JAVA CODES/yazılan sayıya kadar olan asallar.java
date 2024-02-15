package Assignment1;
import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a integer");
		int num=in.nextInt();         // we took a int input from user
		for(int i=2;i<=num;i++) {			// used a loop to print prime numbers up to n 
			if(Prime(i)) {					// we checked a number inside n is prime or not by using our method
				System.out.print(i +" ");
			}
		}
	}
	public static boolean Prime(int num) {
		boolean flag = false; int i=2;            // i is 2 because prime numbers begin from 2 
	    while (i <= num / 2) {
	    	 // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;        // if the number is not prime flag is true 
	        break;     // if the number is not prime break the loop no need to try others
	      }

	      ++i;
	    }

	    if (!flag)
	      return true;        // return true if the number is prime
	    else
	      return false;       // return false if the number is not prime
	  }
	
}
