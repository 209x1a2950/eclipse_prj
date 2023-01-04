package pack2;

public class NonSubClass {
	NonSubClass(){
		Same_class sc=new Same_class();
			System.out.println("Default Access Specifier : "+sc.d);
			System.out.println("Private Access Specifier : "+sc.p);
			System.out.println("Protected Access Specifier : "+sc.pro);
			System.out.println("public Access Specifier : "+sc.pub);
		}
}
