package jumpingstatement;

public class jumpingstatementdemo3 {

	public static void main(String[] args) {
		
		for (int a=1; a<=10; a++)
		{
			if(a==3||a==5||a==7)
			{
				continue;
			}
			System.out.println(a);
		}

	}

}
