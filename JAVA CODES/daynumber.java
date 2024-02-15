package daynumber;
import java.util.Scanner;
public class daynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of the day");
		int day = input.nextInt();
			switch(day) {
			case 1:System.out.println("monday"); 
			case 2:System.out.println("tuesday"); break;
			case 3:System.out.println("wednesday"); break;
			case 4:System.out.println("thursday"); break;
			case 5:System.out.println("friday"); break;
			case 6:System.out.println("saturday"); break;
			case 7:System.out.println("sunday"); break;
			default: System.out.println("1 ile7 arasında bir rakam giriniz");
			}
		
	}

}
