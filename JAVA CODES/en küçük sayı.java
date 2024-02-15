package zzassignment;
import java.util.Scanner;
public class abb {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.print("Enter the first number:");
	int sayi1= input.nextInt();
	System.out.print("Enter the second number:");
	int sayi2= input.nextInt();
	System.out.print("Enter the third number:");
	int sayi3= input.nextInt();
	m1(sayi1, sayi2, sayi3);
	}
	public static void m1(int n1, int n2, int n3) {
	if (n1<n2 && n1<n3)
		System.out.println("En kucuk sayi: " + n1);
	else if (n2<n1 && n2<n3)
		System.out.println("En kucuk sayi: " + n2);
	else
		System.out.println("En kucuk sayi: " + n3);
	}

}
