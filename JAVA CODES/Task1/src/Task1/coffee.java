package Task1;

public class coffee {

	double weight;
	double unit_price;
	
	coffee(double weight,double unit_price)
	{
		this.weight=weight;
		this.unit_price=unit_price;
	}
	public void calculate_price()
	{
		System.out.println(weight*unit_price);
	}
}

