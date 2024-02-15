package zzyeni;
import java.util.*;
public class f {

		public static void main(String[] args) {
			int number=2;	
			int count =1;
				
			for(int i=1;i<=5;i++) {                                          
					count=1;													
					for(int j=1;count<=10;j++) {
						
						if (deneme(number)) {
							System.out.print(number+ " ");
							count++;
						}
						number++;
					}
					System.out.println(" ");               

				}
			
			
			
			
			
			}
		
		public static boolean deneme(int number1) {
			boolean a =true;
			for(int divisor=2;divisor<=number1/2;divisor++) {     
				if(number1%divisor==0) {
					a =false;
					return a;
				}
				
				}
		return a;
				
		}
		}


				
	
			
			
		