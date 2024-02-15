package deneme;
import java.util.Scanner;
public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("kare için s ve S dikdörtgen için r veya R yazýnýz");
	char þekil = scan.next().charAt(0);
	if(þekil=='s' || þekil=='S') {
		System.out.println("karenin bir kenarýný giriniz");
	double kenar = scan.nextDouble();
	System.out.println("karenin alaný:" + kenar * kenar);}
	else if(þekil=='r'|| þekil=='R') {
		System.out.println("dikdörtgenin kýsa kenarýný giriniz");
	double kkenar = scan.nextDouble();
		System.out.println("dikdörtgenin uzun kenarýný giriniz");
	double ukenar = scan.nextDouble();
	if(kkenar > ukenar) {
		System.out.println("kýsa kenar uzun kenardan büyük olamaz");}
	else
	System.out.println("dikdörtgenin alaný:" + kkenar * ukenar);
	
	} 
	else
		System.out.println("Lütfen kare ya da dikdörtgen giriniz");
	
	}

}
