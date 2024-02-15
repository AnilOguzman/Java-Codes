package zzassignment;
import java.util.Scanner;
public class abe {

	public static void main(String[] args) {
	TC();

	}
 public static void TC() {
	 int sum=0;
	 int temp=0;
	 Scanner input= new Scanner(System.in);
	 System.out.print("Enter your ID number: ");
	 String no= input.nextLine();
	 if (no.length()==11) {
		 int number= Integer.parseInt(no);
		 int ld= number%10;
	  if (ld>0) {
		  for(int i=0; i<=9; i++) {
		temp= no.charAt(i);
		sum+= temp;
		 }
		  if (sum%10==ld) {
			  System.out.println("Valid ID!");
		  }
		  else 
			  System.out.println("Invalid ID!");
	 }
	  else
		  System.out.println("Invalid ID!");
 }
	 else
		 System.out.println("Invalid ID!");
}
}