package deneme;
import java.util.Scanner;
public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("kare i�in s ve S dikd�rtgen i�in r veya R yaz�n�z");
	char �ekil = scan.next().charAt(0);
	if(�ekil=='s' || �ekil=='S') {
		System.out.println("karenin bir kenar�n� giriniz");
	double kenar = scan.nextDouble();
	System.out.println("karenin alan�:" + kenar * kenar);}
	else if(�ekil=='r'|| �ekil=='R') {
		System.out.println("dikd�rtgenin k�sa kenar�n� giriniz");
	double kkenar = scan.nextDouble();
		System.out.println("dikd�rtgenin uzun kenar�n� giriniz");
	double ukenar = scan.nextDouble();
	if(kkenar > ukenar) {
		System.out.println("k�sa kenar uzun kenardan b�y�k olamaz");}
	else
	System.out.println("dikd�rtgenin alan�:" + kkenar * ukenar);
	
	} 
	else
		System.out.println("L�tfen kare ya da dikd�rtgen giriniz");
	
	}

}
