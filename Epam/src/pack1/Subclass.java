package pack1;

public class Subclass extends Same_class{
	
		
		Subclass(){
			System.out.println("Default Access Specifier : "+d);
			//System.out.println("Private Access Specifier : "+p); //Can't be accessed
			System.out.println("Protected Access Specifier : "+pro);
			System.out.println("public Access Specifier : "+pub);
		}
		

}
