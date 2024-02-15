
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
	public double ComputeTaxedPrice()
	{
		return 0;
	}
}
