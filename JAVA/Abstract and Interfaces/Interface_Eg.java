package abstractAndInterfaces;

interface Vehicle
{
	String getColor();		//it will be like public abstract String getColor();
	public abstract String getEngineType();
	int x = 4;				// its like public static final int x = 4;
}


public class Interface_Eg implements Vehicle {
	
	public String getColor()
	{
		return "Strig";
	}
	
	public String getEngineType()
	{
		return "Anystring";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
