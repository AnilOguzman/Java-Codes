package grade1;
import java.util.Scanner;
public class grade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if(number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;   }
			
		System.out.println("İşlemi yapınız:" + (number1 + "-" + number2));
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if(answer == (number1 - number2)) 
			System.out.println("Tebrikler sonuç doğru");
		else
			System.out.println("Yanlış cevap " + (number1 - number2) + " olmalıydı");
		
		        
	}

}
