import java.util.*;
public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
hm.put(1, 91);
hm.put(2, 57);
System.out.println("Enter seconds : ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sec=n%60;
n=n/60;
int min=n%60;
n=n/60;
int hr=(n%60)%24;
System.out.println("Hr : Min :Sec "+hr+":"+min+":"+sec);
		
	}

}
