package zzgereksiz1;
import java.util.*;
public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please enter a string:");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		findletter_recursive(input);
		if(upper>lower) System.out.println("1");
		else if(upper==lower)  System.out.println("0");
		else System.out.println("-1");
	}
	public static int lower=0;
	public static int upper=0;
	public static void findletter_recursive(String a)	{
		if(Character.isLowerCase(a.charAt(0)))
			lower++;
		else if(Character.isUpperCase(a.charAt(0)))
			upper++;
		if(a.length()!=1)	
			findletter_recursive(a.substring(1));
			
			
			
		}								
	}


