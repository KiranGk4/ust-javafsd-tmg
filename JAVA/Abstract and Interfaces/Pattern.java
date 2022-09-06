package abstractAndInterfaces;

class Pattern1
{
	public void display()
	{
		for(int i=0; i<10; i++)
				System.out.println("*");
	}
	public void display(char symbol)
	{
		for(int i=0; i<10;i++)
			System.out.println(symbol);
	}
}


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 p1 = new Pattern1();
		p1.display();
		System.out.println("\n");
		p1.display('#');
	}

}
