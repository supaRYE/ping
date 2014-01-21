import java.util.ArrayList;
import java.util.List;

/*
 * Author(s): Ryan Tsoi
 */

public class Email {
	
	private List<User> to;
	private List<User> bcc;
	private List<User> cc;
	private User from;
	private String subject;
	private String text;
	
	public Email(List<User> to, List<User> bcc, List<User> cc, User from, String subject, String text) {
		this.to = new ArrayList<User>(to);
		this.bcc = new ArrayList<User>(bcc);
		this.cc = new ArrayList<User>(cc);
		this.from = from;
		this.subject = subject;
		this.text = text;
	}
	
	public List<User> getTo() {
		return new ArrayList<User>(to);
	}
	
	public List<User> getBcc() {
		return new ArrayList<User>(bcc);
	}
	
	public List<User> getCc() {
		return new ArrayList<User>(cc);
	}
	
	public User getFrom() {
		return from;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String getText() {
		return text;
	}
}
