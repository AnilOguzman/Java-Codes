package remove;
import java.util.*;
public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		String name = input.nextLine();
		System.out.println("Enter a letter");
		char letter = input.next().charAt(0);
		remove(name,letter);
	}
		public static void remove(String name1, char letter1) {
		String storage="";
		name1=name1.toLowerCase();
		int number = name1.length();
		for(int k=0;k<number;k++) {
			if(letter1==name1.charAt(k)) {
			}
			else {
			storage += name1.charAt(k);
			}
				
		}
		System.out.println(storage);
		}
	}
