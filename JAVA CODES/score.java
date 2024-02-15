package score;
import java.util.Scanner;
public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your score");
		int score = input.nextInt();
		if(score<40 && score>=0)
			score = 1;
			else if (score>=40 && score<=59)
				score=2;
			else if(score>=60 && score<=69)
				score=3;
			else if(score>=70 && score<=89)
				score=4;
			else if(score>=90 && score<=100)
				score=5;
			else 
				System.out.println("0-100 arasý sayý giriniz");
		switch(score) {
		case 1:System.out.println("F"); break;
		case 2:System.out.println("D"); break;
		case 3:System.out.println("C"); break;
		case 4:System.out.println("B"); break;
		case 5:System.out.println("A"); break;
		}
	}

}
