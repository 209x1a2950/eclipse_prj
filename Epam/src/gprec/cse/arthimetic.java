package gprec.cse;

 public class arthimetic {

	 int sum(int a, int b) {
		return a+b;
	}
	 int sub(int a, int b) {
		return a-b;
	}
	 int mul(int a, int b) {
		return a*b;
	}
	 
		 int div(int a, int b) {
	try 
	{if(b==0)
		throw new ArithmeticException("Divide by zero");
	else	
	return a/b;
	}
	catch(ArithmeticException e){
		System.out.println("Exception Caught"+e.getMessage());
		return -1;
	}
	//catch(Exception e1) {
		//System.out.println("Exception Caught"+e1.getMessage());
	//return -1;
	//}
	finally {
		System.out.println("Finally Executed");
		
	}
	}
}
