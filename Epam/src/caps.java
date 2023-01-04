import java.util.*;
public class caps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
/*System.out.println("Enter a String : ");
		String str=sc.nextLine();
		System.out.println(str);
		str=str.toUpperCase();
		System.out.println(str);
	*/
		/*String s1="CSE";
		String s2="CSE";
		String s3=new String("CSE");
		String s4=new String("CSE").intern();
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);
String s5= "cse";
System.out.println(s1.equalsIgnoreCase(s5));
System.out.println(s5.charAt(1));
String s6="GPREC";
System.out.println(s6.substring(1,3));
String s7=s6.concat(s5);
System.out.println(s7);
	StringBuffer sb=new StringBuffer("gprec");
	System.out.println(sb.reverse());
	*/
/*System.out.println("Enter a String : ");
		String s1=sc.next();
		StringBuffer sb=new StringBuffer("");
		sb.append(s1);
		sb.reverse();
		if(s1.contentEquals(sb))
		System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	*/
String str1=sc.nextLine();
String str2=sc.nextLine();
int l1=str1.length();
if(str1.charAt(l1-1)==str2.charAt(0)) {
	str1=str1.concat(str2.substring(1));
}
else
	str1=str1.concat(str2);
System.out.println(str1);
	
	}
	
}
