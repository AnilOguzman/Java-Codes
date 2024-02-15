import java.util.Scanner;

public class mainExample1 {

	public static void main(String[] args)
	{
		
		Scanner scanner=new Scanner(System.in);
		double coef1=0;
		System.out.print("Please enter coefficent of X^2:");
		while(!(scanner.hasNextDouble()))
		{
			scanner.next();
			System.out.println("please enter a valid variable");
		}
		coef1=scanner.nextDouble();
		System.out.print("Please enter coefficent of X:");
		while(!(scanner.hasNextDouble()))
		{
			scanner.next();
			System.out.println("please enter a valid variable");
		}
		double coef2=scanner.nextDouble();
		
		System.out.print("Please enter constant coefficent:");
		while(!(scanner.hasNextDouble()))
		{
			scanner.next();
			System.out.println("please enter a valid variable");
		}
		double coef3=scanner.nextDouble();
		
		System.out.println();// One space down
		// Compute Delta value
		double delta=Math.pow(coef2, 2)-4*coef1*coef3;
		
		//System.out.println(delta);
		
		
		if (delta<0)
		{
			System.out.println("The equation has not real roots!!!");
		}
		
		else if(delta==0)
		{
			double root1=((-1)*coef2)/(2*coef1); 
			System.out.printf("The equation has one root: %.3f ",root1);
			
		}
		
		else
		{
			double root1= (-coef2 + Math.pow(delta, 0.5)) / (2.0 * coef1);  
		    double root2= (-coef2 - Math.sqrt(delta)) / (2.0 * coef1);  
		    
		    System.out.printf("The equation has two roots: %.3f and %.3f ",root1,root2);
		}
		
		
		
		
		
		

	}

}