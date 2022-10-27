import java.lang.*;
import java.io.*;
import java.util.*;


public class UserBO
{
	String res = " ", ePassword = " ";
	char ch;
	int ascii;
	User users[] = new User[5];
	User[] getUsers()
	{
		users[0] = new User(1,"Louis","rxfsuzA2345");
		users[1] = new User(2,"Messie","hpphmf1:");
		users[2] = new User(3,"Steve","opefkt");
		users[3] = new User(4,"Kallis","23456778");
		users[4] = new User(5,"Wipro","A$%");
		return users;
	}
	
	private String encryptedPassword(String password)
	{
		
		for(int i=0;i<password.length();i++)
		{
			ch = password.charAt(i);
			ascii = (int)ch;
			ascii++;
			ch = (char)ascii;
			res = res + ch;
		}
		res = res.trim();
		return res;
	}

	boolean validate(String username, String password)
	{	
		
		int flag = 0;
		for(User u:users)
		{

			ePassword = encryptedPassword(password);
			if((username.equals(u.getUsername())) && (u.getPassword().equals(ePassword)))
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
			return true;
		else
			return false;
	}
}