package abstractAndInterfaces;

interface Language1
{
	void getName(String name);
}

class ProgrammingLanguage implements Language1
{
	public void getName(String name)
	{
		System.out.println("Programming Language: "+name);
	}
}
public class Interface_Language_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");
	}

}
