package inheritance;

class D
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class E extends D
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
class C extends E
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}

public class inheritancedemo2 {

	public static void main(String[] args) {
		
		C cobj=new C();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();
		cobj.print();
		cobj.show();
		

	}

}
