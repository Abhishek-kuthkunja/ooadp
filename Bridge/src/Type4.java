

public class Type4 implements DiscountSlab{
	float rate= 0.15f;
	float discount;
	
	public void CalcDiscount(float r){
		discount = price * quantity *( rate +r);
		System.out.println("Price :$ "+price + " Quantity :$ "+quantity);
		System.out.println("Discount = $" + discount);
		float bill = price * quantity - discount;
		System.out.println("Bill = $"+ bill);
	}
}