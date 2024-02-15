package asal;
import java.util.*;
public class asal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		int number1=in.nextInt();
		
		int number=2;	
		int count =1;
			for(int i=1;i<=5;i++) {                                          // 5 satiri sayiyor
				count=1;													// her satirda 10 asal olup olmadigini sayacak
				for(int j=1;count<=10;j++) {
					boolean a =true;
					for(int divisor=2;divisor<=number/2;divisor++) {     // kontrol döngüsü asal olup olmadigini
						if(number%divisor==0) {
							a =false;
						}
					
					}
					if (a) {
						System.out.print(number+ " ");
						count++;
					}
					number++;
				}
				System.out.println(" ");               

			}
		
		
		
		
		
		}
		}
	