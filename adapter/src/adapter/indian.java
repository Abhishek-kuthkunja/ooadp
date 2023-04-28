package adapter;

public class indian implements caltax {
	double amount;
	public double taxamount(String name,int quantity,int price)
	{
		amount=10*price*quantity;
		return amount;
	}

}
