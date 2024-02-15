package area;
import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("select a shape");
		char selection = scan.next().charAt(0);
		if (selection=='s' || selection=='S' )
		{
			System.out.println("enter side length of square");
		double kenar = scan.nextDouble();
		System.out.println("alan" + Math.pow(kenar, 2));
		}
		else if(selection=='R' || selection=='r')
		{
			System.out.println("enter short edge");
			double kenar1=scan.nextDouble();
			System.out.println("enter long edge");
		double kenar2 = scan.nextDouble();
		if(kenar1>kenar2)
			System.out.println("short edge cannot be longer than long edge");
		
		else
			System.out.println("alan" + kenar1 * kenar2);
			}
	}

}
