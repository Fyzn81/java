package inheritance;

class parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class child1 extends parent
{
	int x;
	void print()
	{
		System.out.println(x);
	}
}
class child2 extends parent
{
	int y;
	void show()
	{
		System.out.println(y);
	}
}

public class inheritancedemo3 {

	public static void main(String[] args) {


		child1 ch1=new child1();
		ch1.a=100;
		ch1.x=200;
		ch1.display();
		ch1.print();
		
		child2 ch2=new child2();
		ch2.a=300;
		ch2.y=400;
		ch2.display();
		ch2.show();

	}

}
