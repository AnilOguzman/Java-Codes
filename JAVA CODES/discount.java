package discount;
import java.util.Scanner;
public class discount {

	public static void main(String[] args) {
		System.out.println("Enter the sale price");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();
		
		if( price <= 100 ) 
			price = (price - (price * 0.04));
		
		else if(price <= 250)
			price = (price - 5 - (price - 100) * 0.07 );
		else
			price = (price - 18 - (price - 250) * 0.1 );
		System.out.println("Net price" + price);
		
		

	}

}
