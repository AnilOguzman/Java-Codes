package digit;
import java.util.Scanner;
public class digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1-999999999");
		int number = input.nextInt();
		if(number>=1 && number<=9)
			System.out.println(number + "is a one digit number");
		else if(number>=10 && number<=99)
			System.out.println(number + "is a two digit number");
		else if(number>=100 && number<=999)
			System.out.println(number + "is a three digit number");
		else if(number>=1000 && number<=9999)
			System.out.println(number + "four digit number");
		else if(number>=10000 && number<=99999)
			System.out.println("five");
		else if(number>=100000 && number<=999999)
			System.out.println("six");
		else if(number>=1000000 && number<=9999999)
		System.out.println("seven");
		else if(number>=1000000 && number<=99999999)
		System.out.println("eight");
		else if(number>=100000000 && number<=999999999)
		System.out.println("nine");
		else 
			System.out.println("enter a number between 1-999999999 ");
		
	}

}
