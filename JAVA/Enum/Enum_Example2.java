package enums;
enum Size1
{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}
public class Enum_Example2 {
	Size1 pizzaSize;
	public Enum_Example2(Size1 pizzaSize)
	{
		this.pizzaSize = pizzaSize;
	}
	
	public void orderPizza()
	{
		switch(pizzaSize)
		{
		case SMALL:		System.out.println("I ordered a small size pizza.");
						break;
		case MEDIUM: 	System.out.println("I ordered a medium size pizza. ");
						break;
		default:		System.out.println("I don't know which one to order.");
						break;
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enum_Example2 e1 = new Enum_Example2(Size1.MEDIUM);
		e1.orderPizza();
	}

}
