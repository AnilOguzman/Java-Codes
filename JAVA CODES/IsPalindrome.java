package assignments;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		String realWord=word; 
		word = word.replaceAll(" ", "");              
		int min=0;
		int max=word.length()-1;
		 boolean isPalindrome = true;		
		 while(min<max) {
			if(word.charAt(min) != word.charAt(max)) {
			 isPalindrome = false;	
			 break;
			}
			min++;
			max--;
		}
		if (isPalindrome)
		      System.out.println(realWord + " is a palindrome");
		    else
		      System.out.println(realWord + " is not a palindrome");
	}

}
