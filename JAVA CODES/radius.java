package radius;

import java.util.Scanner;

public class radius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the radius of the circle");
		Scanner sn = new Scanner(System.in);
		Double radius = sn.nextDouble();
		Double area = Math.PI * radius * radius;
		System.out.println("Area="+area);
	}

}
