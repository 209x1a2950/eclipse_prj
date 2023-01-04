package gprec.cse;
import java.util.*;
public class nprime {
public int pow(int a,int b) {
	if(b==0)
		return 1;
	if(b==1)
		return a;
	//return a*pow(a,b-1);
	if(b%2==0)
	return pow(a,b/2)*pow(a,b/2);
	else
		return a*pow(a,b/2)*pow(a,b/2);
		
}
String str="Asher";
//String str1=str.reverse();
}
