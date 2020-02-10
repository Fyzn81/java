package Overloading;

public class constructoroverloading {
	
	
	constructoroverloading(int a,int b)
	
	{
		System.out.println(a+b);
	}
	

	constructoroverloading(double a,int b)
	
	{
		System.out.println(a+b);
	}

	constructoroverloading(double a,double b)
	
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
	constructoroverloading co= new constructoroverloading(200.00,100);
		

	}

}
