

import java.util.Scanner;
public class mainExample2 {

	public static void main(String[] args) {
		
		
		int min=10;
		int max=100;
		
		int endNumber = min+(int)( Math.random()*(max-min+1));
		
		System.out.printf("Random generated number: %d \n",endNumber);
		
		System.out.printf("ALL ODD NUMBERS UP TO %d\n",endNumber);
		
		for(int i=0;i<=endNumber;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}
		
		
		

	}

}
