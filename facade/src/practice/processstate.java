package practice;
import java.util.*;
public class processstate {
String giftcard;
int noitem;
int billamount;
processstate(String giftcard,int noitem,int billamount)
{
	this.giftcard=giftcard;
	this.noitem=noitem;
	this.billamount=billamount;
}
void op1()
{
	System.out.println(giftcard);
	if(noitem>1)
	{
		System.out.println("u dont have gift card and billamout is"+billamount);
		
	}
	else
	{
		if(noitem==1)
		{
			System.out.println("ur eligibal to take the giftcard discount");
		}
	}
	
}
}
