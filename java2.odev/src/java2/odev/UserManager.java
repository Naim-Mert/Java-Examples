package java2.odev;

public class UserManager extends User {
	
	public void add(User user)
	{
		System.out.println(user.getFirstName()+ "" +user.getLastName()+ "" +"The user has been added to the system");

	}
	
	public void login(User user)
	{
		System.out.println(user.getFirstName()+ "" +user.getLastName()+ "" +"The user logged into the system");
		
	}
	public void logout(User user)
	{
		System.out.println(user.getFirstName()+ "" +user.getLastName()+ "" +"The user logged out to the system");

	}
	public void delete(User user)
	{
		System.out.println(user.getFirstName()+ "" +user.getLastName()+ "" +"The user delete to the system");

	}
}
