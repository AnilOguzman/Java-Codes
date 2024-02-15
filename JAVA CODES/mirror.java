package assignment3;
import java.util.*;
public class iki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		mirror(num);
		a=num;
	}
	public static int a=0;
	
	public static void mirror(int n) {
		System.out.print(n+",");
		if(n==0) n=1;
		else if((n!=1 || n!=-1) && n!=a) {
			n=n/2;	
		mirror(n);}
			
		}
	}

