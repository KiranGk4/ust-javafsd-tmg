import java.lang.*;
import java.io.*;
import java.util.*;

public class Driver
{
	public static void main(String args[])
	{
		int n;
		String username, password, encryptPass;
		Scanner sc = new Scanner(System.in);
		UserBO user = new UserBO();
		User users[] = user.getUsers();
		
		System.out.println("Id\tUsername\tPassword");
		for(User u:users)
		{
			System.out.println(u.getId()+"\t"+u.getUsername()+"\t\t"+u.getPassword());
		}
		System.out.println("Enter the Credential to Login");
		System.out.print("Enter username: ");
		username = sc.next();
		System.out.print("Enter password: ");
		password = sc.next();
		boolean check = user.validate(username, password);
		if(check)
			System.out.println("Login Successfull...!");
		else
			System.out.println("Invalid username/password");
	}
}