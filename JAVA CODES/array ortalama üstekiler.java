package array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many numbers will u sum");
		int n =input.nextInt();                 
		double[] liste= new double[n];
		double sum=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter a value");
			liste[i]=input.nextDouble();
			sum += liste[i];
		}
		int count=0;
		sum/=n;
		for(int i=0;i<liste.length;i++) {
			if(liste[i]>sum) 
				count++;
		}
		System.out.println(count);
	}

}
