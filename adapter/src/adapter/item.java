package adapter;

public class item {

	int quantity=10;
	int price;
	String name;
	caltax c1;
	public item(int price, String name, caltax c1) {
		this.price = price;
		this.name = name;
		this.c1 = c1;
	}
	void settax(caltax c2)
	{
		this.c1=c2;
	}
	void printdeatails()
	{
		double tax=c1.taxamount(name, quantity, price);
		System.out.println("tax is"+tax);
	}
	
}
