package SumOfSeries;

import java.util.Scanner;

public class testSumSeries {

	public static void main(String[] args) {
		
       Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number:");
		double x=scanner.nextDouble();
		
		System.out.printf("\nf(" + x + ") = %.4f", f_sum(x));

	}

	private static double f_sum(double x) {
		
		 double i=1;
		
		double sum=Math.pow(x, i/(i+1));
		
		return f_sum(sum,i,x);
		
		
	}

	private static double f_sum(double x,double sum, double i ) {
		
		if(i==100) return sum;
		
		i+=1;
		
		sum+=(Math.pow(x, i/(i+1)));
		//System.out.println(sum);
		
		return f_sum(x, sum, i);
		
	}

}
