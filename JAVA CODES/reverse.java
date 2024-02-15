package assignments;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a word to reverse it");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine(); 
		int min=0;
		int max=word.length()-1;		
		 while(min<=max) {
			char deneme=(word.charAt(max));
			System.out.print(deneme);
			max--;
				
	}


}
	}

