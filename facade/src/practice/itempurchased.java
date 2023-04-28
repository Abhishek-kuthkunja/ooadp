package practice;
import java.util.*;
public class itempurchased {
HashMap<String,Integer> Items;
int a;
itempurchased()
{
	this.Items=new HashMap<String,Integer>();
}
void get()
{
	System.out.println("item purchased");
	System.out.println(Items);
}

void details()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("number of item u have bout");
	 a=sc.nextInt();
	for(int i=0;i<a;i++)
	{
		System.out.println("enter the item name");
		String aa=sc.next();
		Items.put(aa,i+1);
	}
}
int num()
{
	return a;
}

}
