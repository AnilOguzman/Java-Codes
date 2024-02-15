package recursive.aray.loop;

import java.util.Scanner;

public class recursiveArrayLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Enter few characters: ");
		    Scanner scan = new Scanner(System.in);
		    String s = scan.nextLine();
		    char[] chars = new char[s.length()];
		    for(int i = 0; i < s.length(); i++){
		        chars[i] = s.charAt(i);
		    }
		    System.out.println("Enter desired character: ");
		    char ch = scan.nextLine().charAt(0);

		    System.out.println(count(chars, ch));
		}

		public static int count(char[] chars, char ch){
		    return count(chars, ch, 0, 0);
		}

		public static int count(char[] chars, char ch, int high, int index){
		    if(index == chars.length){
		        return high;
		    }
		    if(chars[index] == ch){
		        return count(chars, ch, high + 1, index + 1);
		    } else{
		        return count(chars, ch, high, index + 1);
		    }
		}
		}
