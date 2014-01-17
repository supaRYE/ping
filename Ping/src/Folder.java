import java.util.ArrayList;
import java.util.List;

/*
 * Author(s): Ryan Tsoi
 */

public class Folder {
	
	private String name;
	private List<Email> emails;
	
	public Folder(String name) {
		this.name = name;
		emails = new ArrayList<Email>();
		
	}
}
