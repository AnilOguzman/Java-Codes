package grade;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the midterm1 grade");
		Double midterm1 = input.nextDouble();
		midterm1 = midterm1 * 15 / 100;
		System.out.println("Enter the midterm2 grade");
		Double midterm2 = input.nextDouble(); 
		midterm2 = midterm2 * 15 / 100;
		System.out.println("Enter the assignment grade");
		Double assignment = input.nextDouble();
		assignment = assignment * 20 / 100;
		System.out.println("Enter the quiz grade");
		Double quiz = input.nextDouble();
		quiz = quiz * 10 / 100;
		System.out.println("Enter the fýnal grade");
		Double fýnal = input.nextDouble();
		fýnal = fýnal * 40 / 100;
		System.out.println("midterm1:" + midterm1);
		System.out.println("midterm2:" + midterm1);
		System.out.println("assignment:" + assignment);
		System.out.println("quiz:" + quiz);
		System.out.println("fýnal:" + fýnal);
		
		
		

	}

}
