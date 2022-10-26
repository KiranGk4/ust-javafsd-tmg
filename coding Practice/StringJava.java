import java.util.*;
public class StringJava
{
	public static void main(String args[])
	{
		char ch[] = {'A','b','c','d','e','f'};
		String s = new String(ch);
		System.out.println("Char in String: "+s);
		System.out.println("length of ch: "+ch.length);
		System.out.println("Length of s = "+s.length());
		System.out.println("Substring begin2: "+s.substring(2));
		System.out.println("Substring begin1 and end4: "+s.substring(1,4));
		String sjoin = String.join("-",s,"TEST");
		System.out.println("join: "+sjoin);
		System.out.println(s.equals("Abcdef"));
		System.out.println(s.isEmpty());
		System.out.println(s.concat(sjoin));
		System.out.println(sjoin.replace(s,"ABCD"));
		String s1 = "Kiran";
		String s2 = "kiran";
		System.out.println(s1.equalsIgnoreCase(s2)+" "+s1.equals(s2));
		String sArr[] = s.split("-");
		for(String i:sArr)
		{
			System.out.println(s);
		}
		String ss1 = new String("Kiran").intern();
		String ss2 = new String("Kiran").intern();
		System.out.println(ss1 == ss2);
	}
}
