package Assignment2;
import java.util.*;
public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer value");
		int number = input.nextInt();
		int line =1;
		int inverse = number;
		while( line<=number) {
			int a=1;
			
			while(a<=number) {
				while(a==line || a==inverse) {
						System.out.print("x");
						a++;
				}
				if(a<=number)
				System.out.print("o");
				a++;

			}
			System.out.println("");
			
			line++;
			inverse--;
		}
	}

}
