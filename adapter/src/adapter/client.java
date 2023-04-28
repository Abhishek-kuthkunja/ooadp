package adapter;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		indian i=new indian();
		
		item i1=new item(1000,"indian",i);
		i1.printdeatails();
		mauri c2=new mauri();
		i1.settax(c2);
		i1.printdeatails();

	}

}
