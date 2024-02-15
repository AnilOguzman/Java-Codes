package XnComputing;

import java.util.Scanner;

public class testXn {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter base value(x):");
		int x=scanner.nextInt();
		
		System.out.println("Enter exponent value(n):");
		int n=scanner.nextInt();
		
		System.out.printf("%d^%d=%d ",x,n,recursivePowerMethod(x,n));
		System.out.printf("%d^%d=%d ",x,n,recursivePowerMethod2(x,n,1));
		
		

	}

	private static int recursivePowerMethod(int x, int n) {
		
		if(n==0)  return 1;
		else if(n==1) return x;
		else return x*recursivePowerMethod(x, n-1);
	}

private static int recursivePowerMethod2(int x, int n,int result) {
		
		if(n==0)  return result;
		else return recursivePowerMethod2(x, n-1,x*result);
	}
}
