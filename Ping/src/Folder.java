import java.util.ArrayList;
import java.util.List;

/*
 * Author(s): Ryan Tsoi
 */

public class Folder {
	
	private String name;
	private List<Email> emails;
	private boolean deletable;
	
	public Folder(String name, boolean deletable) {
		this.name = name;
		this.deletable = deletable;
		emails = new ArrayList<Email>();
	}
	
	public List<Email> getEmails() {
		return new ArrayList<Email>(emails);
	}
	
	public boolean deleteEmail(Email toDelete) {
		return emails.remove(toDelete);
	}
}
