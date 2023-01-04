package gprec.cse;
import java.util.*;
public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter value of b : ");
		int b=sc.nextInt();
		arthimetic ar =new arthimetic();
		System.out.println(ar.sum(a,b));
		System.out.println(ar.div(a,b));

	}

}
