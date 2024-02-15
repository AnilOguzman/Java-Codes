package task6;

public class Item {

	String name;
	double price;
	int amount;
	double total;
	Item(String name,double price,int amount)
	{
		this.name=name;
		this.amount=amount;
		this.price=price;
		this.total=price*amount;
	}
	public double ComputeTaxedPrice()                     // bu olmasa maindeki for un içindeki ComputeTaxedPrice lar hata veriyor
	{														// product ve servicedeki ComputeTaxedPrice hata vermiyor
		return 0;							// ama önceliði bunu kullanmak deðil product ve servicedeki ComputeTaxedPrice kullanmak(override)
	}
}
