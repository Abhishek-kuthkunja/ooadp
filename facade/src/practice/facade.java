package practice;

public class facade {
 itempurchased p1;
 processstate a1;
  facade(String giftcard,int billamount)
  {
	  p1=new itempurchased();
	  p1.details();
	  int b=p1.num();
	  a1=new processstate(giftcard,b,billamount);
  }
  public void op2()
  {
	  a1.op1();
  }
}
