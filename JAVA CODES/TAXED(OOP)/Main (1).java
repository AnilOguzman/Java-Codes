import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item [] list=new Item[4];
		list[0]=new Product("Iphone",10000,20);
		list[1]=new Service("Repair of Screen",4000,2);
		list[2]=new Product("Macbook",30000,10);
		list[3]=new Service("Battery Power",1000,2);
		double sum_product=0,sum_service=0;
		for(int i=0;i<4;i++)
		{
			if(list[i] instanceof Product)
				sum_product+=list[i].ComputeTaxedPrice();
			else
				sum_service+=list[i].ComputeTaxedPrice();
		}
		System.out.println("total taxed price of product:"+sum_product);
		System.out.println("total taxed price of service:"+sum_service);

	}

}
