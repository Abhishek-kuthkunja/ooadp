package adapter;

public class mauri implements caltax {
	
	public double taxamount(String Name, int quantity,int tax)
	{
		return 0.1*quantity*tax;
	}
	
}
