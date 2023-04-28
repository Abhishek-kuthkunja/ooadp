package practice;
import java.util.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("neter the bill amount gift card ");
		String a=sc.next();
		int bb=sc.nextInt();
		facade b1=new facade(a,bb);
		b1.op2();
	}

}
