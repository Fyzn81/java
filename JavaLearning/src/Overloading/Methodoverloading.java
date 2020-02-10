package Overloading;

public class Methodoverloading {
	
	//method overloading is a feature that allow to
	//have more than 1 method have the same name 

	void add (int a,int b)
	{
		System.out.println(a+b);
	}
	
	void add (int a,double b)
	{
		System.out.println(a+b);
	}
	
	void add (double a,double b)
	{
		System.out.println(a+b);
	}
		
	void add (int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading mo=new Methodoverloading();
		mo.add(10,20);
		mo.add(10, 20.0);
		mo.add(1.0, 2.0);
		mo.add(10, 20, 3);

	}

}
