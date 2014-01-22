import java.util.ArrayList;
import java.util.List;

/*
 * Author(s): Ryan Tsoi, Brandon Koopmans
 */

public class User 
{
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private List<Folder> folders;
	
	public User(String userName, String password, String firstName, String lastName) 
	{
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		folders = new ArrayList<Folder>();
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public List<Folder> getFolders()
	{
		return new ArrayList<Folder>(folders);
	}
}

