package assignments;

import java.util.Scanner;

public class hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the phrase (Be careful to use English characters.!):");
		String word = input.nextLine(); 
		word = word.trim(); 
		word = word.replaceAll(" ", "  ");
		word = word.toLowerCase();
		String word1 = word.replaceAll("[a-z]", "_ ");
		int hak=10;
		System.out.print("\n");                                                             
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("\t\t\t ######## HANGMAN ########");
		System.out.print("\n");
		System.out.println("GOOD LUCK!");
		while(word1.contains("_") && hak>0){
			System.out.print("\n");
			System.out.println("You have " + hak + " chances to guess!");
			System.out.print("\n");
			System.out.println("YOUR WORD IS: " + word1);
			System.out.print("\n");
			System.out.println("PLEASE ENTER A LETTER: ");
			String tahmin=input.nextLine();
			if(!(word.contains(tahmin))) {
				System.out.print("\n");
				System.out.println("The word doesn't contain letter "+tahmin+".");			
				hak--;
			}
			else if(word.contains(tahmin)) {
				hak--;
				int k=0;
				while(k<word.length()) {
				String deneme=String.valueOf(word.charAt(k));
				if(deneme.equalsIgnoreCase(tahmin)){
				word1 = word1.replaceAll("_ ", "_");
				String word2;																				
				word2 = word1.substring(0, k) + tahmin + word1.substring(k + 1);
				word2 = word2.replaceAll("_", "_ ");
				word1 = word2;
				k++;
				}
				else {
					k++;
				}
				
			}
			
		
		
		}
							
	}
		if(!(word1.contains("_")) && hak>=0) {
			System.out.print("\n");
			System.out.println("YOUR WORD WAS: " + word);
			System.out.print("\n");
			System.out.println("CONGRATULATIONS YOU WIN!");
		}
		else if(word1.contains("_") || hak>=0) {
			System.out.print("\n");
			System.out.println("YOUR WORD WAS: " + word);
			System.out.print("\n");
			System.out.println("YOU LOSE, TRY AGAIN!");
		}
	}
}

