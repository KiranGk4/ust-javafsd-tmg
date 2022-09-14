package enums;

public class Enum_Switch {
	enum Size2
	{
		SMALL, MEDIUM, LARGE, EXTRALARGE;
		public String getSize()
		{
			switch(this) {
			case SMALL: 	return "small";
			case MEDIUM:	return "medium";
			case LARGE: 	return "large";
			case EXTRALARGE:	return "extralarge";
			default:	return null;
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("The size of the pizza is "+Size2.SMALL.getSize());
		}
	}
	

}
