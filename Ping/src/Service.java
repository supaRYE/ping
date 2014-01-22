import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Service {
	
	public static List<User> userList = new ArrayList<User>();
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main (String[] args) {
		String inputLine;
		
		while(true) {
			try {
				System.out.println("Select Option By Number\n1: Log in to existing account\n2: Create new account");
				inputLine = input.readLine();
				
				if (inputLine.equals("1")) {
					userLogin();
				} else if (inputLine.equals("2"))
					createUser();
				else
					System.out.println("Invalid command");				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Creates a new user and adds it to the global list of users. Will not allow a user to be created
	// using a pre-existing username.
	public static void createUser() {
		try {
			String userName;
			while (true) {
				System.out.println("Enter user name, or type exit to return to the main screen:");
				userName = input.readLine();
				if (userName.equals("exit"))
					return;
				else if (!userList.contains(new User(userName, "", "", "")))
					break;
				System.out.println("Sorry, that user name is already taken.");
					
			}
			System.out.println("Enter Password");
			String password = input.readLine();
			System.out.println("Enter First Name");
			String firstName = input.readLine();
			System.out.println("Enter Last Name");
			String lastName = input.readLine();
			User newUser = new User(userName, password, firstName, lastName);
			userList.add(newUser);
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void userLogin() {
		
	}
}