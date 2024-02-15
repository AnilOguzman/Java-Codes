package atm;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("çekmek istediginiz miktari giriniz");
Scanner input = new Scanner(System.in);
int money = input.nextInt();
int money200 = money / 200;
int resultmoney = money - (money200 * 200 );
int money100 = resultmoney / 100;
int resultmoney1 = resultmoney - (money100 * 100);
int money50 = resultmoney1 / 50;
int resultmoney2 = resultmoney1 - (money50 * 50);
int money20 = resultmoney2 / 20;
int resultmoney3 = resultmoney2 - (money20 * 20);
int money10 = resultmoney3 / 10;
int resultmoney4 = resultmoney3 - (money10 * 10);
System.out.println("200 TL banknot sayısı:" + money200);
System.out.println("100 TL banknot sayısı:" + money100);
System.out.println("50 TL banknot sayısı:" + money50);
System.out.println("20 TL banknot sayısı:" + money20);
System.out.println("10 TL banknot sayısı:" + money10);
System.out.println("Verilemeyen para miktarý:" + resultmoney4);
	}

}
